package Part1Basics

object CBVVsCBN extends App {

  def callByValue(n: Long) = {
    println("value " + n)
    println("value " + n)
  }

  def callByName(n: => Long) = {
    println("name " + n)
    println("name " + n)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())
}

// call by value evaluates the expression befor calling the function, & hence actual value is get replaced with formal argument
// call by name didn't evaluate the expression befor calling the function, actual expression is kept as itis as  a formal argument & at every use of function expressio gets evaluated
//hence the result of every usage is not identical
//call by name argumant is represented with the symbol =>
