/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cosplay.games.bird

import org.cosplay.*
import games.*
import CPPixel.*
import CPArrayImage.*
import CPFIGLetFont.*
import CPKeyboardKey.*
import prefabs.shaders.*
//import prefabs.sprites.*
import scala.util.*
import CPColor.*

/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII JVM GAME ENGINE FOR SCALA3
              (C) 2021 Rowan Games, Inc.
                ALl rights reserved.

*/


object CPBirdGameScene extends CPScene("play", None, GAME_BG_PX):
    private var speed = 1f
    private var vel = 0f
    private val jump = 7f
    private val gravity = 0.3f
    private var delta = 0.4f

    private var start = true

    private val pipeGap = 15f
    private var pipeX = 0f
    private var curPipe = false
    private var pipeCut = 0f
    private var pipeWidth = 5f
    private var pipeCheck = false

    private var dead = false
    private var score = 0

    private val buildingList = null

    private val roofPx = '_'&C_SANDY_BROWN
    private val wallPx = '|'&C_SANDY_BROWN

    private val posX = 10
    private val width = 5
    private val height = 5
    private var startPos = 5

    private def mkScoreImage(score: Int): CPImage = FIG_BIG.render(score.toString, C4).trimBg()

    private val birdImgs = new CPArrayImage(
        prepSeq(
            """
              | \\
              |( ^)>
              | //
              |------
              | //
              |( -)>
              | \\
              |------
            """
        ).filter(!_.endsWith("------")),
        (ch, _, _) => ch match
            case '^' | '-' => ch&C_WHITE
            case _ => ch&C4
    ).split(5, 3)

    private val birdAnis = Seq(CPAnimation.filmStrip("ani", 250, imgs = birdImgs))
    private val birdSpr = new CPAnimationSprite("bird", anis = birdAnis, 15, 5, 0, "ani", false):
        override def update(ctx: CPSceneObjectContext): Unit =
            super.update(ctx)
            val canv = ctx.getCanvas

            ctx.getKbEvent match
                case Some(evt) =>
                    evt.key match
                        case KEY_LO_W | KEY_UP | KEY_SPACE =>
                            if !dead then
                                vel = 0
                                vel -= jump
                                delta = 0.6f

                                if !start then start = true

                        case _ => ()
                case None => ()

            if start then
                vel += delta

            if start then
                if vel <= 0 then
                    setY(getY - 1)
                    vel += 1
                else if vel > 0 then
                    setY(getY + (gravity * vel).toInt)
                    delta += 0.001f

            if (getY <= pipeCut.toInt - pipeGap.toInt) || (getY + getHeight) >= pipeCut.toInt && start then
                if ((getX + getWidth) >= pipeX.toInt) && getX <= pipeX.toInt + (pipeWidth - 1) then
                    println("Died :(")
                    dead = true
                    delta = 0.4
                    vel = 0
                    speed = 0f
                    setX(pipeX.toInt - (pipeWidth + 2).toInt)

            if dead && getY >= canv.height then
                start = false

    private val scoreSpr = new CPImageSprite("score", 10, 0, 1, mkScoreImage(score)):
        override def update(ctx: CPSceneObjectContext): Unit =
            val canv = ctx.getCanvas

            setX((canv.width / 2) - 3)

    private val pipeSpr = new CPCanvasSprite("pipe"):
        private val px = '|'&C_GREEN
        override def update(ctx: CPSceneObjectContext): Unit =
            super.update(ctx)
            val canv = ctx.getCanvas

            if start then
                if !curPipe then
                    curPipe = true
                    pipeCheck = false
                    pipeX = canv.xMax.toFloat
                    pipeCut = CPRand.between(12f, canv.yMax - 2f)
                else
                    if pipeX <= -pipeWidth then
                        curPipe = false
                    else
                        pipeX -= speed

                    if pipeX <= birdSpr.getX - pipeWidth  && !pipeCheck then
                        score += 1
                        println(score)
                        scoreSpr.setImage(mkScoreImage(score))
                        pipeCheck = true

                canv.drawLine(pipeX.toInt, pipeCut.toInt, pipeX.toInt, canv.dim.h, 0, px)
                canv.drawLine(pipeX.toInt, pipeCut.toInt - pipeGap.toInt, pipeX.toInt, 0, 0, px)

                for x <- 0 until pipeWidth.toInt - 1 do
                    canv.drawLine(pipeX.toInt + x, pipeCut.toInt, pipeX.toInt + x, canv.dim.h, 0, px)
                    canv.drawLine(pipeX.toInt + x, pipeCut.toInt - pipeGap.toInt, pipeX.toInt + x, 0, 0, px)

//    def building(width:Int, height:Int, posX:Int, startPos:Int) : Unit =
//        val building = new CPCanvasSprite("building":
//            override def update(ctx: CPSceneObjectContext): Unit =
//                super.update(ctx)
//                val canv = ctx.getCanvas
//
//                //Roof
//                canv.drawLine(posX, startPos + height, posX + width, startPos + height, 0, roofPx)
//
//                //Walls
//                canv.drawLine(posX, startPos, posX, startPos + height, 0, wallPx)
//                canv.drawLine(posX + width, startPos, posX + width, startPos + height, 0, wallPx)

    private val building = new CPCanvasSprite("building"):
        override def update(ctx: CPSceneObjectContext): Unit =
            super.update(ctx)
            val canv = ctx.getCanvas
    
            //Roof
            canv.drawLine(posX, startPos + height, posX + width, startPos + height, 0, roofPx)
    
            //Walls
            canv.drawLine(posX, startPos, posX, startPos + height, 0, wallPx)
            canv.drawLine(posX + width, startPos, posX + width, startPos + height, 0, wallPx)

    addObjects(
        // Handle 'Q' press globally for this scene.
        CPKeyboardSprite(KEY_LO_Q, _.exitGame()),
        birdSpr,
        pipeSpr,
        scoreSpr
    )


