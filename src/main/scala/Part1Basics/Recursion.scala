package Part1Basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(num: Int): Int = {
    if (num <= 1) 1
    else {
      println(
        "computing factorial of " + num + " first need factorial of " + (num - 1))
      val result = num * factorial(num - 1)
      println("computing factorial of " + num)
      result
    }
  }

  //println(factorial(10))
  // println(factorial(4500))

  //SOLUTION OF STACKOVERFLOW EXCEPTION IS TO USE TAIL RECURSION

  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factorialTailRec(n: Int, accumulator: Int): Int = {
      if (n <= 1) accumulator
      else {
        factorialTailRec(n - 1, n * accumulator) //TAIL RECURSION = use the recursive call as the last expression
      }
    }
    factorialTailRec(n, 1)
  }

//  println(anotherFactorial(10))
//  println(anotherFactorial(5500))

  //WHEN YOU NEED LOOP USE TAIL RECURSION

  //EXERCISE
  //concatenate string n times using tails recursion

  def concateStr(str: String, n: Int): String = {
    def concateRec(str: String, n: Int, acc: String): String = {
      if (n < 1) acc
      else
        str + concateRec(str, (n - 1), "")

    }
    concateRec(str, n, "")
  }

  println(concateStr("hello", 3))

  //ISPRIME TAIL RECURSION

  def isPrime(n: Int): Boolean = {
    def isPrimeRec(t: Int, acc: Boolean): Boolean = {
      if (t <= 1) true
      else if (!acc) false
      else isPrimeRec(t - 1, n % t != 0 && acc)
    }
    isPrimeRec(n / 2, true)
  }

  println(isPrime(6))
  println(isPrime(7))
  println(isPrime(1))

  /*  def fibonaci(n: Int): Int = {
    def fibinacciRec(t: Int, acc: Int): Int = {
      if (t <= 1) 1
      else fibinacciRec()

    }
    fibinacciRec(n, 1)
  }

  fibonaci(5)*/
}
