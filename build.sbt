name := "basic-project"

organization := "example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test",
  "org.specs2" %% "specs2-mock" % "3.0" % "test"
)

initialCommands := "import example._"
