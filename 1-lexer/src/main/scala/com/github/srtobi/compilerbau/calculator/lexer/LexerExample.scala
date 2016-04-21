package com.github.srtobi.compilerbau.calculator.lexer

import scala.io.Source

/**
  * Created by Tobias on 21.04.2016.
  */
object LexerExample {
    def main(args: Array[String]): Unit = {
        val stream = getClass.getResourceAsStream("/calctest.txt")
        val source = Source.fromInputStream(stream)

        val lex = new Lexer(source)

        lex.foreach { tok => print(tok); }
    }
}
