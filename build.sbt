import scala.sys.process._

name := "zzz"

scalaVersion := "3.4.0"

ThisBuild / scalacOptions ++= Seq("-Xfatal-warnings")

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.sksamuel.avro4s" %% "avro4s-core" % "5.0.9",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion
)
// M1 mac
PB.protocExecutable := file("which protoc".!!.trim)
ThisBuild / scalacOptions += "-Yretain-trees"
