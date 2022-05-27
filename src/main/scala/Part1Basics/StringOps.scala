package Part1Basics

object StringOps extends App {

  val string: String = "Hi, I am, learning scala"

  println(string.substring(4, 7))
  println(string.split(",").toList)
  println(string.startsWith("hello"))
  println(string.toLowerCase)
  println(string.toUpperCase)
  println(string.length)
}
