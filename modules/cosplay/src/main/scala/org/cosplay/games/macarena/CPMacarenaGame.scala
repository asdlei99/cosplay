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

package org.cosplay.games.macarena

/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII JVM GAME ENGINE FOR SCALA3
              (C) 2021 Rowan Games, Inc.
                All rights reserved.
*/

import org.cosplay.*
import CPColor.*
import CPPixel.*
import CPKeyboardKey.*
import org.cosplay.CPFIGLetFont.*
import prefabs.images.ani.*
import prefabs.scenes.*
import prefabs.shaders.*
import prefabs.sprites.*
import CPCenteredImageSpriteOrientation.*

/**
  * Five stick-figures dancing macarena. You control dances by pressing their numbers
  * on the keyboard.
  *
  * ### Running Game
  * One-time Git clone & build:
  * {{{
  *     $ git clone https://github.com/nivanov/cosplay.git
  *     $ cd cosplay
  *     $ mvn package
  * }}}
  * to run the game:
  * {{{
  *     $ mvn -f modules/cosplay -P macarena exec:java
  * }}}
  *
  * @note See more details at [[https://cosplayengine.org/devguide/quick_game.html]]
  */
object CPMacarenaGame:
    /**
      * Entry point for JVM runtime.
      *
      * @param args Ignored.
      */
    def main(args: Array[String]): Unit =
        val BLUE_BLACK = CPColor("0x00000F")
        val bgPx = ' '&&(BLUE_BLACK, BLUE_BLACK)
        val shimmers = CS_X11_ORANGES ++ CS_X11_BLUES
        val dim = CPDim(100, 23)
        val DANCE_FPS = 5

        // Initialize the engine.
        CPEngine.init(CPGameInfo(name = "ASCII Macarena", initDim = dim.?))

        val music = CPSound(src = "sounds/games/macarena/macarena.wav") // https://freesound.org

        def mkSprite(id: String, aniFrames: Seq[CPImage], x: Int, y: Int, key: CPKeyboardKey): CPSceneObject =
            val fiShdr = new CPFadeInShader(false, 1000, bgPx)
            val idleImg = aniFrames.head.skin((px, _, _) => px.withFg(C_GRAY5))
            val idleAni = CPAnimation.filmStrip(s"ani-idl-$id", 1_000 / DANCE_FPS, true, false, Seq(idleImg))
            val danceAni = CPAnimation.filmStrip(s"ani-dance-$id", 1_000 / DANCE_FPS, true, false, aniFrames)
            new CPAnimationSprite(s"spr-$id", Seq(idleAni, danceAni), x, y, 0, idleAni.getId, false, Seq(fiShdr)):
                override def update(ctx: CPSceneObjectContext): Unit =
                    super.update(ctx)
                    ctx.getKbEvent match
                        case Some(evt) =>
                            if evt.key == key then // Toggle dancing/idling.
                                if getCurrentAnimation == idleAni then change(danceAni.getId, true, false)
                                else change(idleAni.getId, true, false)
                        case None => ()

        val startX = 35
        val x = startX
        val y = 13
        val beatShdr = new CPBeatShader(music.?)
        val titleSpr = new CPCenteredImageSprite(
            img = FIG_BIG_MONEY_NE.withFullWidth().render("MACARENA", CPColor.C_RED3A).trimBg().copy((px, _, _) => px.withFg(CPRand.rand(shimmers))),
            z = 0,
            orient = HOR,
            shaders = Seq(beatShdr))
        titleSpr.setY(3)
        val danceFloor = CPScene("danceFloor", dim.?, bgPx,
            titleSpr,
            mkSprite("1", CPMacarena1AniImage.trimBg().split(3, 3), x, y, KEY_1),
            mkSprite("2", CPMacarena2AniImage.trimBg().split(3, 3), x + 7, y, KEY_2),
            mkSprite("3", CPMacarena3AniImage.trimBg().split(3, 4), x + 7 * 2, y - 1, KEY_3),
            mkSprite("4", CPMacarena4AniImage.trimBg().split(3, 3), x + 7 * 3, y, KEY_4),
            mkSprite("5", CPMacarena5AniImage.trimBg().split(3, 3), x + 7 * 4, y, KEY_5),
            new CPLabelSprite(startX, 18, 0, "[1]    [2]    [3]    [4]    [5]", C_DARK_CYAN),
            CPKeyboardSprite(KEY_LO_Q, _.exitGame()), // Exit the game on 'Q' press.
            new CPOffScreenSprite:
                override def onStart(): Unit =
                    music.loop(1500) // Auto-play with fade-in.
                    beatShdr.start() // Start beat shader in the same time.
        )

        // Start the game & wait for exit.
        try CPEngine.startGame(
            // CosPlay logo scene.
            new CPSlideShimmerLogoScene("logo", dim.?, bgPx, shimmers, nextSc = "danceFloor"),
            danceFloor
        )
        finally CPEngine.dispose()

        sys.exit(0)
