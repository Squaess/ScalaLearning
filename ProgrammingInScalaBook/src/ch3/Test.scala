package ch3

import java.math.BigInteger

object Test extends App {
  val big = new BigInteger("12345")
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))
  greetStrings.update(1, "#, ")
  println(greetStrings.apply(1))

  /**
    * That was the bad examples. I mean
    * they show some concepts but are not
    * recommended way of initializing objects
    * in scala.
    */

  val numNames = Array("zero", "one", "two")
  /**
    * Lists
    */
  val oneTwoThree = List(1,2,3)

  val oneTwo = List(1,2)
  val threeFour = List(3,4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwoThreeFour)

  println(2 :: threeFour)
  println(1 :: 2 :: 3 :: 4 :: Nil)
  val c = oneTwoThreeFour.count(s => s.isInstanceOf[Int])
  println(c)
  println(oneTwoThreeFour.drop(2))
  println( oneTwoThreeFour.dropRight(2))
  val fall = oneTwoThreeFour.forall( s => s<10)
  println(fall)

  /**
    * Tuples
    */

}
