package com.github.boniface

import io.circe.Json
import org.scalatest.funsuite.AnyFunSuite

class LibrariesSpec  extends AnyFunSuite {
  test("Cats and Circe should work together") {
    val json = Json.obj("test" -> Json.fromString("value"))
    assert(json.isObject)
  }
}
