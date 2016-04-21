lazy val commonSettings = Seq(
    organization := "com.github.srtobi",
    scalaVersion := "2.11.8"
)


lazy val lexer = project.in(file("1-lexer"))
    .settings(commonSettings: _*)
    .settings(
        name := "Lexer",
        version := "0.0.1"
    )