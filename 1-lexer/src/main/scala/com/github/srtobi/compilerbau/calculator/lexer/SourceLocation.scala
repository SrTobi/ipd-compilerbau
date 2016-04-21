package com.github.srtobi.compilerbau.calculator.lexer


class SourceLocation(val line: Int, val column: Int) {
    override def toString = s"[Line $line, Column $column]"
}