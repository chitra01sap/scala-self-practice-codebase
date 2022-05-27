package Part1Basics

object ValuesVariablesTypes extends App {

  val x = "Let's say welcome to new learning";
  println(x)

  //VALS ARE IMMUTABLE
  //TYPES OF VALS ARE OPTIONAL
  //COMPILER CAN INFER THE TYPES
  //semicolon are optional

  val y: Int = 7; val n = "multiple stmt"
  println(y + " " + n)

  //semicolon required for declaring multiple stmt in single line

  val str: String = "this is string data type"
  val inter: Int = 8
  val flag: Boolean = false
  val char: Char = 'A'
  val double: Double = 823.32098
  val float: Float = 2398f
  val short: Short = 7238

  //VARIBLES

  var variable: Int = 8

  variable = 9 //MUTABLE VARIABLE CAN BE MODIFIABLE
}
