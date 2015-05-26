name := "mxdemo"

version := "1.0"


scalaVersion := "2.10.4"

libraryDependencies ++= Seq( jdbc , anorm , cache)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )


play.Project.playScalaSettings