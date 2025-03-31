ThisBuild / scalaVersion := "3.6.4"
ThisBuild / organization := "com.github.boniface"
ThisBuild / version := "0.1.2"

ThisBuild / versionScheme := Some("early-semver")
ThisBuild / licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / description := "Scala 3 Libraries for use across Scala 3 Projects"
ThisBuild / homepage := Some(
  url("https://github.com/boniface/scala-base-libs")
)
ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  Resolver.jcenterRepo,
)
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/boniface/scala-base-libs"),
    "scm:git:git@github.com:boniface/scala-base-libs.git",
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "scala-base-libs",
    libraryDependencies ++= Dependencies.all,
  )

publishMavenStyle := true

publishTo := {
  val ghRepository = "boniface/scala-base-libs"
  val ghPackages = "https://maven.pkg.github.com/" + ghRepository
  Some("GitHub Package Registry".at(ghPackages))
}

credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "boniface",
  sys.env.getOrElse("GITHUB_TOKEN", ""),
)

