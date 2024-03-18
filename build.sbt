name := "zzz"

scalaVersion := "3.4.0"

ThisBuild / scalacOptions ++= Seq("-Xfatal-warnings")

Compile / PB.targets := Seq(
  PB.gens.java -> (Compile / sourceManaged).value / "java",
  scalapb.gen(javaConversions=true) -> (Compile / sourceManaged).value / "scalapb"
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.sksamuel.avro4s" %% "avro4s-core" % "5.0.9",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion
)

ThisBuild / scalacOptions += "-Yretain-trees"
