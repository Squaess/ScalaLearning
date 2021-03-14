package ch4

import org.scalatest.funsuite.AnyFunSuite

class ChecksumAccumulatorTest extends AnyFunSuite {
  test("ChecksumAccumulator.calculate") {
    println(ch4.ChecksumAccumulator.calculate("Eveery value is an object."))
  }
}
