package com.github.srtobi.compilerbau.calculator.lexer

import com.github.srtobi.compilerbau.calculator.lexer.Tokens._


class Lexer(val source: io.Source) extends Iterator[Token] {

    private var line: Int = 1
    private var column: Int = 0
    private implicit def location = new SourceLocation(line, column)

    private def readnext(): Char = {
        if(!source.hasNext)
            return ' '

        val c = source.next()

        if(c == '\n') {
            column = 0
            line += 1
        }

        column += 1
        c
    }

    def readfloat: Token = {

    }

    def next(): Token = {

        Iterator.continually {
            if(!hasNext)
                T_EOF()
            else
                readnext() match {
                    case '+' => T_PLUS()
                    case '-' => T_MINUS()
                    case '*' => T_STAR()
                    case '/' => T_SLASH()
                    case '(' => T_LPAREN()
                    case ')' => T_RPAREN()
                    case _ => readfloat
                }
        }.filter(tok => tok != null).next()
    }

    override def hasNext: Boolean = source.hasNext
}