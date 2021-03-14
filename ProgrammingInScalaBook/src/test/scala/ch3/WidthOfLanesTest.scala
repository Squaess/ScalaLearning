package ch3

import org.scalatest.funsuite.AnyFunSuite

class WidthOfLanesTest extends AnyFunSuite {
  test("WidthOfLanes.readFile") {
    val currentDirectory = new java.io.File(".").getCanonicalPath
    val lines = ch3.WidthOfLanes
      .readFile(currentDirectory + "/build.sbt")
    val longestLine = ch3.WidthOfLanes.longestLine(lines)
    ch3.WidthOfLanes
      .printFormatted(
        lines,
        ch3.WidthOfLanes.widthOfLength(longestLine)
      )
  }
}
