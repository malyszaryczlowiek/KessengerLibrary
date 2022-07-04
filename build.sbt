ThisBuild / version := "0.1.3"
ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "KessengerLibrary",
    idePackagePrefix := Some("com.github.malyszaryczlowiek"),
    //organization := "com.github.malyszaryczlowiek",
    githubTokenSource := TokenSource.GitConfig("github.token"),
    githubOwner := "malyszaryczlowiek",
    githubRepository := "KessengerLibrary",
    publishConfiguration := publishConfiguration.value.withOverwrite(true) // dodane później
  )

/*

[info] 	published kessengerlibrary_3 to https://maven.pkg.github.com/malyszaryczlowiek/KessengerLibrary/kessengerlibrary/kessengerlibrary_3/0.1.0/kessengerlibrary_3-0.1.0.pom
[info] 	published kessengerlibrary_3 to https://maven.pkg.github.com/malyszaryczlowiek/KessengerLibrary/kessengerlibrary/kessengerlibrary_3/0.1.0/kessengerlibrary_3-0.1.0.jar
[info] 	published kessengerlibrary_3 to https://maven.pkg.github.com/malyszaryczlowiek/KessengerLibrary/kessengerlibrary/kessengerlibrary_3/0.1.0/kessengerlibrary_3-0.1.0-sources.jar
[info] 	published kessengerlibrary_3 to https://maven.pkg.github.com/malyszaryczlowiek/KessengerLibrary/kessengerlibrary/kessengerlibrary_3/0.1.0/kessengerlibrary_3-0.1.0-javadoc.jar

 */