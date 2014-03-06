import AssemblyKeys._

name := "SolarSystemGrandTour"

version := "0.5.0"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies  ++= Seq(
    "org.scalanlp" %% "breeze-math" % "0.5-SNAPSHOT",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "com.github.nscala-time" %% "nscala-time" % "0.4.2",
    "org.apache.commons" % "commons-math3" % "3.2",
    "com.github.fommil.netlib" % "all" % "1.1.1" pomOnly()
)

resolvers ++= Seq(
    "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

assemblySettings
