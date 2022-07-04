ThisBuild / version := "0.1.0"
ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "KessengerLibrary",
    idePackagePrefix := Some("com.github.malyszaryczlowiek"),
    //organization := "com.github.malyszaryczlowiek",
    githubTokenSource := TokenSource.GitConfig("github.token"),
    githubOwner := "malyszaryczlowiek",
    githubRepository := "KessengerLibrary"
  )

