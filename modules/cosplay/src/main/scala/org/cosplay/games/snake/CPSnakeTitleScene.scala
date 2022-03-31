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

package org.cosplay.games.snake

import org.cosplay.games.*
import org.cosplay.*
import CPColor.*
import CPArrayImage.*
import prefabs.shaders.*
import CPPixel.*
import CPKeyboardKey.*

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

/**
  * Title scene for snake game.
  */
object CPSnakeTitleScene extends CPScene("title", None, BG_PX):
    private val introSnd = CPSound(s"sounds/games/snake/intro.wav", 0.5f)
    private val helpImg = CPArrayImage(
        prepSeq(
            """
              |      ______     __   __     ______     __  __     ______
              |     /\  ___\   /\ "-.\ \   /\  __ \   /\ \/ /    /\  ___\
              |     \ \___  \  \ \ \-.  \  \ \  __ \  \ \  _"-.  \ \  __\
              |      \/\_____\  \ \_\\"\_\  \ \_\ \_\  \ \_\ \_\  \ \_____\
              |       \/_____/   \/_/ \/_/   \/_/\/_/   \/_/\/_/   \/_____/
              |       
              |     
              |>> BEWARE OF INITIAL KEYBOARD PRESS DELAY   <<   ---_,......._-_--.
              |>> CHANGE DIFFICULTY BY RESIZING THE SCREEN <<  (|\ /      / /| \  \
              |                                                /  /     .'  -=-'   `.
              | ____   ____   ____   ____                     /  /    .'             )
              |||w || ||a || ||s || ||d ||                 __/  /   .'       ,_.)   /
              |||__|| ||__|| ||__|| ||__||                / o   o        _.-' /  .''
              ||/__\| |/__\| |/__\| |/__\|                \          _.-'    / .'*|
              |                                            \______.-'//    .'.' \*|
              |                                             \|  \ | //   .'.' _ |*|
              |[ENTER]   Play                                `   \|//  .'.'_ _ _|*|
              |[Q]       Quit                                 .  .// .'.' | _ _ \*|
              |                                                \`-|\_/ /    \ _ _ \*\
              |                                                 `/'\__/      \ _ _ \*\
              |Copyright (C) 2022 Rowan Games, Inc             /^|            \ _ _ \*
              |                                               '  `             \ _ _ \
              |                                                                / _ _ /
              |_,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-.' _ _ /
              | + _ - * - _ * _ - - _ + _ - - _ * _ - + _ - * - _ * _ - - _ * _ _  /
              |_,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-._,._,.-"`-._,.'"
            """),
        (ch, x, y) =>
            if y < 5 || (y == 20 && x <= 35) then ch&C3
            else
                ch match
                    case c if c.isLetter => c&C4
                    case '<' | '>' => ch&C2
                    case '[' | ']' => ch&C5
                    case _ => ch.toUpper&C1
    ).trimBg()

    private val fadeInShdr = CPFadeInShader(true, 2000, BG_PX)
    private val fadeOutShdr = CPFadeOutShader(true, 1000, BG_PX)

    // Add scene objects...
    addObjects(
        CPImageSprite(xf = c => (c.w - helpImg.w) / 2, c => (c.h - helpImg.h) / 2, 0, helpImg),
        new CPOffScreenSprite(shaders = Seq(fadeInShdr, fadeOutShdr)),
        CPKeyboardSprite(KEY_LO_Q, _.exitGame()), // Exit on 'Q' press.
        // Transition to the next scene on 'Enter' press fixing the dimension.
        CPKeyboardSprite(KEY_ENTER, ctx ⇒ fadeOutShdr.start(_.addScene(new CPSnakePlayScene(ctx.getCanvas.dim), true)))
    )

    override def onActivate(): Unit =
        super.onActivate()
        introSnd.loopAll(2000) // Start background audio.

    override def onDeactivate(): Unit =
        super.onDeactivate()
        introSnd.stop(400) // Stop background audio.