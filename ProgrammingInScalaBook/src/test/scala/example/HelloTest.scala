package example

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {
  test("example.Hello.cube") {
    assert(example.Hello.cube(3) == 27)
  }
}
