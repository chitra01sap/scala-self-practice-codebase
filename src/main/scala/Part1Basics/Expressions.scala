package Part1Basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 7 * 2)
  // ablove is the mathematical expresssion like +,- ,/,* <<, >>, <<<(left shoft with zero extemsion),>>> (right shift with zero extension)
  // above expression will get evaluate basis on priority list

  println((1 == x))
  //this is equality operator which will return boolean
  // ! , &&, ||, !=, >=, <=,

  var incrementTest = 6
  incrementTest += 2
  println(incrementTest)
  incrementTest *= 2
  println(incrementTest)
  incrementTest /= 2
  println(incrementTest)
  //also works with +=,*=, /=

  //INSTRUCTIONS VS EXPRESSIONS
  //Instruction => instruction is something where we telling compiler to do certain actions, example, print on console, do computation,change the variable, send this on server etc etc
  // expression => expression is something that has value or type, which is evaluated. In scala or functional programming we think in terms of expression where everything is treated as value,
// where every songle bit of your vode is compute the value

  //IF EXPRESSION
  val acondition = true
  val result = if (acondition) 6 else 7 // here if stmt gives us a value of condition satisfies so its a expression & NOT a instruction
  println(result)

  print(if (acondition) 6 else 7)

  val aWiredvalue
    : Unit = (incrementTest = 2) //UNIT IN SCALA IS  SIMILAR TO VIOD WHICH RETURN MOTHING
  println("\n" + aWiredvalue) // THE RESULT OF UNIT IS ALWYES ()
  //SIDE EFFECTS : println(), whiles,reassigning are all returns unit

  //CODE BLOCKS
  val codeBlocks: String = {
    val y = 2
    val z = y + 1
    if (z > 3) "greater" else "smaleer"
  }

  //final value of the blocks is the value of the last expression from code block
  //scope of the variables declared inside are limited to the blocks only, can't access outside the blocks
}
