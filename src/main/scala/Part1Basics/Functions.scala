package Part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 8))

  def parameterLessFunnction(): Int = 19
  println(parameterLessFunnction())

  def aRepeatedFunction(str: String, n: Int): String = {
    if (n == 1) str
    else str + aRepeatedFunction(str, n - 1)
  }
  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS USE RECURSIVE FUNCTIONS
  //RECURSIVE FUNCTION DOESN'T RECOGNIZE THE RETURN TYPE OF IT'S OWN, WE HAVE TO SPECIFY THE RETURN TYPE EXPLICITELY WHILE USING RECURSIVE FUNCTION

  //CODE BLOCKS ALSO ALLOW YOU DEFINE THE AUXILIARY FUNCTION INSIDE IT
  def aBigFunction(n: Int): Int = {
    def smallFunction(a: Int, b: Int): Int = {
      a + b
    }
    smallFunction(2, 3)
  }

  //EXERCISE

  def greeting(name: String, age: Int): String = {
    val reuslt = s"my name is $name and I am $age years old"
    reuslt
  }

  def factorial(num: Int): Int = {
    if (num <= 1) 1
    else num * (factorial(num - 1))
  }

  def fibonacci(number: Int): Int = {
    if (number == 1) 1
    else if (number == 2) 1
    else
      fibonacci(number - 1) + fibonacci(number - 2)
  }

  def isPrime(num: Int): Boolean = {
    if (num == 0 || num == 1) false
    else if (num == 2) true
    else
      !(2 to (num - 1)).exists((x: Int) => num % x == 0)

  }
  println(isPrime(0))
  println(isPrime(7))
  println(isPrime(31))

  println(fibonacci(9))
  println(factorial(6))
  println(greeting("chitra", 25))
}
