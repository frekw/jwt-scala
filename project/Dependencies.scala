import sbt._

object Dependencies {
  object V {
    val scalatest = "3.0.8"
    val scalatestPlus = "4.0.3"
    val bouncyCastle = "1.64"
    val guice = "4.2.2"

    val play = "2.8.3"
    val playJson = "2.9.1"
    val json4s = "3.6.10"
    val circe = "0.13.0"
    val upickle = "1.2.2"
    val sprayJson = "1.3.5"
    val argonaut = "6.3.1"
  }

  object Libs {
    val play             = "com.typesafe.play" %% "play"      % V.play
    val playJson         = "com.typesafe.play" %% "play-json" % V.playJson
    val playTest         = "com.typesafe.play" %% "play-test" % V.play  % "test"
    val playTestProvided = "com.typesafe.play" %% "play-test" % V.play
    val guice            = "com.google.inject" %  "guice"     % V.guice % "test"

    val json4sCore    = "org.json4s" %% "json4s-core"    % V.json4s
    val json4sNative  = "org.json4s" %% "json4s-native"  % V.json4s
    val json4sJackson = "org.json4s" %% "json4s-jackson" % V.json4s

    val circeCore     = "io.circe" %% "circe-core"    % V.circe
    val circeGeneric  = "io.circe" %% "circe-generic" % V.circe
    val circeParse    = "io.circe" %% "circe-parser"  % V.circe

    val upickle = "com.lihaoyi" %% "upickle" % V.upickle

    val sprayJson = "io.spray" %%  "spray-json" % V.sprayJson

    val argonaut = "io.argonaut" %% "argonaut" % V.argonaut

    val bouncyCastle = "org.bouncycastle" % "bcpkix-jdk15on" % V.bouncyCastle % "test"
    val bouncyCastleTut = "org.bouncycastle" % "bcpkix-jdk15on" % V.bouncyCastle % "tut"

    val scalatest = "org.scalatest" %% "scalatest" % V.scalatest % "test"
    val scalatestPlus = "org.scalatestplus.play" %% "scalatestplus-play" % V.scalatestPlus % "test"
  }
}
