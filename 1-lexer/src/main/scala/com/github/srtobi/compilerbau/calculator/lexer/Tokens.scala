package com.github.srtobi.compilerbau.calculator.lexer

object Tokens {

    sealed abstract class Token(val text: String) {
        def source: SourceLocation
        override def toString = text
    }

    case class T_EOF()(implicit override val source: SourceLocation) extends Token("end of file")
    case class T_PLUS()(implicit override val source: SourceLocation) extends Token("+")
    case class T_MINUS()(implicit override val source: SourceLocation) extends Token("-")
    case class T_STAR()(implicit override val source: SourceLocation) extends Token("*")
    case class T_SLASH()(implicit override val source: SourceLocation) extends Token("/")
    case class T_LPAREN()(implicit override val source: SourceLocation) extends Token("(")
    case class T_RPAREN()(implicit override val source: SourceLocation) extends Token(")")

    case class T_NUMBER(float: Float)(implicit override val source: SourceLocation) extends Token(float.toString)

}