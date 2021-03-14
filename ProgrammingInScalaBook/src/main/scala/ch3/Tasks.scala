package ch3

import java.math.BigInteger
import scala.collection.mutable.{Map => MMap}

object Tasks {
  // BigInteger
  val big = new BigInteger("12345")
  // string Array
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  // for loop
  for (i <- 0 to 2)
    print(greetStrings(i))
  greetStrings.update(1, "#, ")
  println(greetStrings.apply(1))

  /** That was the bad examples. I mean
    * they show some concepts but are not
    * recommended way of initializing objects
    * in scala. Below is a prefered way.
    */

  val numNames = Array("zero", "one", "two")

  /** Lists
    */
  val oneTwoThree = List(1, 2, 3)

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwoThreeFour)

  println(2 :: threeFour)
  println(1 :: 2 :: 3 :: 4 :: Nil)
  val c = oneTwoThreeFour.count(s => s.isInstanceOf[Int])
  println(c)
  println(oneTwoThreeFour.drop(2))
  println(oneTwoThreeFour.dropRight(2))
  val fall = oneTwoThreeFour.forall(s => s < 10)
  println(fall)

  /** Tuples
    * can contain differetn types of element
    */
  val pair = (99, "Some String")
  println(pair._1) // Int
  println(pair._2) // String

  /** Sets and maps
    */
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  println(s"""If the set contains \"Lear\": ${jetSet.contains("Lear")}""")
  println(s"""If the set contains \"Cessna\": ${jetSet.contains("Cessna")}""")

  // Mutable map
  val treasureMap: MMap[Int, String] = MMap[Int, String]()
  treasureMap += (1 -> "Go to the island")
  treasureMap += (2 -> "Find big X on the beach")
  treasureMap += (3 -> "Dig")
  println(treasureMap(2))

  val immutableMap: Map[Int, String] = Map(
    1 -> "I",
    5 -> "V",
    10 -> "X"
  )
  println(immutableMap(10))

  // Imperative way
  def impPrintArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def funcPrintArgs(args: Array[String]): Unit = {
    args.foreach(println)
  }
}
