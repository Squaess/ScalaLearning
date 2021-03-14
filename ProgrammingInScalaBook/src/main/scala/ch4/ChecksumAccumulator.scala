package ch4

import scala.collection.mutable.{Map => MMap}

object ChecksumAccumulator {

  /** Companion object for class
    */
  private val cache = MMap[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s) acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

class ChecksumAccumulator {
  // class definition goes here
  private var sum = 0
  // Expressing side effect
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xff) + 1
}
