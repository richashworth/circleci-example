package com.richashworth.example

import org.scalatest.FunSuite
import Hello._

class HelloSpec extends FunSuite {

  test("addOne should add one") {
    assert(addOne(4) === 5)
  }

  test("Hello should return a greeting") {
    assert(sayHi("Rich") === "Hello, Rich")
  }
}
