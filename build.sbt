// See README.md for license details.

ThisBuild / scalaVersion     := "2.12.12"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "%ORGANIZATION%"

lazy val root = (project in file("."))
  .settings(
    name := "%NAME%",
    libraryDependencies ++= Seq(
      "edu.berkeley.cs" %% "chisel3" % "3.4.1",
      "edu.berkeley.cs" %% "chiseltest" % "0.3.1" % "test",
      "org.scalatest" %% "scalatest" % "3.0.8",
      "org.scalatest" %% "scalatest" % "3.2.0" % "test",
    ),
    scalacOptions ++= Seq(
      "-Xsource:2.11",
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit"
    ),
    addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.4.1" cross CrossVersion.full),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
  )
  

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

