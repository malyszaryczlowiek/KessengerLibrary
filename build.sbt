ThisBuild / version := "0.1.18"
ThisBuild / scalaVersion := "3.1.1"

lazy val root = (project in file("."))
  .settings(
    name              := "KessengerLibrary",
    idePackagePrefix  := Some("com.github.malyszaryczlowiek"),
    organization      := "com.github.malyszaryczlowiek",
    githubTokenSource := TokenSource.GitConfig("github.token"),
    githubOwner       := "malyszaryczlowiek",
    githubRepository  := "KessengerLibrary",
    libraryDependencies ++= Seq(


      // kafka
      ("org.apache.kafka" %% "kafka"         % "3.1.0").cross(CrossVersion.for3Use2_13),
      "org.apache.kafka"  %  "kafka-clients" % "3.1.0",


      // used for serdes
      ("io.circe" %% "circe-core"    % "0.14.2").cross(CrossVersion.for3Use2_13),
      ("io.circe" %% "circe-generic" % "0.14.2").cross(CrossVersion.for3Use2_13),
      ("io.circe" %% "circe-parser"  % "0.14.2").cross(CrossVersion.for3Use2_13),


      // For Tests
      "org.scalameta" %% "munit"            % "0.7.29" % Test,
      "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test

    )
  )


