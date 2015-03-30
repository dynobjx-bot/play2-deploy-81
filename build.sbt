import com.typesafe.sbt.SbtNativePackager._

name := """play2-deploy-81"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

dockerRepository := Some("ginduc")

dockerExposedPorts := Seq(9000)

dockerEntrypoint := Seq("bin/play2-deploy-81", "-J-javaagent:conf/instrument/newrelic.jar")

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.3.1"
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)
