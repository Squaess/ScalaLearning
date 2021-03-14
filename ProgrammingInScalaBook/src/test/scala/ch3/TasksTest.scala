package ch3

import org.scalatest.funsuite.AnyFunSuite

class TasksTest extends AnyFunSuite {

  test("Run the object") {
    ch3.Tasks
    assert(true)
  }

  test("Print imperative") {
    val testArray: Array[String] = Array("First", "Second", "Third")
    ch3.Tasks.impPrintArgs(testArray)
  }

  test("Print more functional") {
    val testArray: Array[String] = Array("First", "Second", "Third")
    ch3.Tasks.funcPrintArgs(testArray)
  }

}
