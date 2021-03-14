lazy val root = (project in file("."))
    .settings(
        name := "ProgrammingInScalaBook",
        scalaVersion := "2.13.4"
    )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % "test"
