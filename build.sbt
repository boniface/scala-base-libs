ThisBuild / scalaVersion := "3.6.4"
ThisBuild / organization := "com.github.boniface"
ThisBuild / version := "0.1.0"

ThisBuild / versionScheme := Some("early-semver")
ThisBuild / licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / description := "Scala 3 Libraries for use across Scala 3 Projects"
ThisBuild / homepage := Some(
  url("https://github.com/boniface/hash-media-deps-plugin")
)
ThisBuild / resolvers ++= Seq(
  "Akka library repository".at("https://repo.akka.io/maven"),
  Resolver.jcenterRepo,
)
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/boniface/hash-media-deps-plugin"),
    "scm:git:git@github.com:boniface/hash-media-deps-plugin.git",
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "scala-base-libs",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0",
      "io.circe" %% "circe-core" % "0.14.12",
      "org.http4s" %% "http4s-core" % "0.23.30",
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
    )
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

