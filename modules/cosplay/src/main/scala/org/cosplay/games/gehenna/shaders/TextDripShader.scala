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

package org.cosplay.games.gehenna.shaders

import org.cosplay.*
import games.gehenna.*
import scala.util.*

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


object TextDripShader extends CPShader:
    private var go = false
    private var firstFrame = false
    private var startFrame = -1L
    private var currDrip = true
    private var newDrip = true
    private var currDripHeight = 0

    private var randX = 0

    def start(): Unit =
        go = true
        firstFrame = true
    def stop(): Unit =
        go = false
        firstFrame = false

    override def render(ctx: CPSceneObjectContext, objRect: CPRect, inCamera: Boolean): Unit =
        if go && ctx.isVisible then
            if firstFrame then
                startFrame = ctx.getFrameCount
                firstFrame = false

            val canv = ctx.getCanvas
            val curFrame = ctx.getFrameCount

                objRect.loop((x, y) => {
                if canv.isValid(x, y) then
                    if newDrip then
                        val imageOffSet = (canv.w - objRect.w) / 2
                        randX = CPRand.between(imageOffSet, objRect.w + imageOffSet)
                        newDrip = false

                    val zpx = canv.getZPixel(x, y)
                    val newY = 3 + (curFrame - startFrame) * (y - objRect.y)
                    canv.drawPixel(zpx.px, randX, newY.toInt, zpx.z)

                    // Reset drip.
                    if newY >= canv.yMax + 300 && ctx.getFrameCount % 10 == 0 then
                        startFrame = ctx.getFrameCount
                        newDrip = true
                    //canv.drawPixel(GAME_BG_PX, x, y, zpx.z)
            })

            // TODO: detect the end of the effect and call stop().


