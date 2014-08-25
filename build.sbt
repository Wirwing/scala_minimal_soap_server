name := "myproject"

organization := "myorganization"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.4"

tomcat()

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"

libraryDependencies += "javax" % "javaee-api" % "7.0" % "provided"

