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

package org.cosplay.games.mir.os.progs.mash.compiler

/*
   _________            ______________
   __  ____/_______________  __ \__  /_____ _____  __
   _  /    _  __ \_  ___/_  /_/ /_  /_  __ `/_  / / /
   / /___  / /_/ /(__  )_  ____/_  / / /_/ /_  /_/ /
   \____/  \____//____/ /_/     /_/  \__,_/ _\__, /
                                            /____/

          2D ASCII GAME ENGINE FOR SCALA3
            (C) 2021 Rowan Games, Inc.
               ALl rights reserved.
*/

import org.cosplay.games.mir.os.progs.mash.compiler.antlr4.*
import org.antlr.v4.runtime.tree.*
import org.antlr.v4.runtime.*

/**
  *
  */
class CPMirMashCompiler:
    /**
      *
      * @param code
      * @param origin
      */
    class FiniteStateMachine(code: String, origin: String) extends CPMirMashBaseListener

    /**
      *
      * @param code
      * @param origin
      */
    private def antlr4Setup(code: String, origin: String): (FiniteStateMachine, CPMirMashParser) =
        val lexer = new CPMirMashLexer(CharStreams.fromString(code, origin))
        val parser = new CPMirMashParser(new CommonTokenStream(lexer))

        // State automata + it's parser.
        new FiniteStateMachine(code, origin) -> parser

    /**
      *
      * @param code
      * @param origin
      */
    def compile(code: String, origin: String): CPMirMashCompilerResult =
        val (fsm, parser) = antlr4Setup(code, origin)

        // Parse the input IDL and walk built AST.
        (new ParseTreeWalker).walk(fsm, parser.mash())

        null // TODO

