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

package org.cosplay.prefabs.images

import org.cosplay.*
import org.cosplay.CPColor.*
import org.cosplay.CPArrayImage.*
import org.cosplay.CPPixel.*


/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII GAME ENGINE FOR SCALA3
            (C) 2021 Rowan Games, Inc.
               All rights reserved.
*/

/**
  * https://www.asciiart.eu/
  */
object CPLanderImage extends CPArrayImage(
    prepSeq(
        """
          |                    _  _     ____________.--.
          |                 |\|_|//_.-"" .'    \   /|  |
          |                 |.-\"\"\"-.|   /       \_/ |
          |                 \  ||  /| __\_____________ |
          |                 _\_||_/_| .-""            ""-.  __
          |               .' '.    \//                    ".\/
          |               ||   '. >()_                     |()<
          |               ||__.-' |/\ \                    |/\
          |                  |   / "|  \__________________/.""
          |                 /   //  | / \ "-.__________/  /\
          |              ___|__/_|__|/___\___".______//__/__\
          |             /|\     [____________] \__/         |\
          |            //\ \     |  |=====| |   /\\         |\\
          |           // |\ \    |  |=====| |   | \\        | \\
          |          //__| \ \   |  |=====| |   | |\\       |--\\
          |         //___|  \_\  |  |=====| |   |_|_\\      |___\\
          |        //-.__|_______|__|_____|_|_____[__\\_____|__.-\\
          |       //        //        /          \ `-_\\/         \\
          |      //        / /       /____________\    \\          \ \
          |     //      .-/_/-.                         \\        .-\_\-.
          |    / /      '-----'                         \ \      '._____.'
          | .-/_/-.                                    .-\_\-.
          |'._____.'                                  '._____.'
    """),
    (ch, _, _) => ch&C_GREEN
)

/**
  * Previews image using the built-in image viewer.
  */
@main def previewLanderImage(): Unit =
    CPImage.previewImage(CPLanderImage.trimBg())
    sys.exit(0)

