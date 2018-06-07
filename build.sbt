import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "suranyi.domonkos",
      scalaVersion := "2.12.6",
      version      := "0.0.0"
    )),
    name := "game-of-life",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.5" % "test",
                                "junit" % "junit" % "4.12")
  )
