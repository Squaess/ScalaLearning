package ch2.loops

object TestLoop {
  /**
    * This example show different type of usage of
    * scala loops. Most of them are implemented in
    * a bad way, as functions should not have a side
    * effect, which printing is. In my opinion best()
    * function is the best way to print all arguments.
    */

  def first(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def second(args: Array[String]): Unit = {
    args.foreach( arg => println(arg))
  }

  def best(args: Array[String]): Unit ={
    args.foreach(println)
  }

  def main(args: Array[String]): Unit = {
    first(args)
    second(args)
    best(args)
  }
}
