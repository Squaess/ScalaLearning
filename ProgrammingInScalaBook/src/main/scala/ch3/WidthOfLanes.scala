package ch3

import scala.io.Source

object WidthOfLanes {

  def readFile(fileName: String): List[String] = {
    Source.fromFile(fileName).getLines().toList
  }

  def widthOfLength(s: String): Int = s.length.toString.length

  def longestLine(lines: List[String]): String =
    lines.reduceLeft((a, b) => if (a.length > b.length) a else b)

  def printFormatted(lines: List[String], maxWidth: Int): Unit = {
    for (line <- lines) {
      val initSpaces = maxWidth - widthOfLength(line)
      println(" " * initSpaces + line.length + " | " + line)
    }
  }

}
