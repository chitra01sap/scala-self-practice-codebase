package Part2Basics

object Arithmetic {

  // Main method
  def main(args: Array[String]) = {

    // Try clause
    try {
      // Dividing a number
      val result = 11 / 0
    }

    // Catch clause
    catch {
      // Case statement
      case x: ArithmeticException => {

        // Display this if exception is found
        println("Exception: A number is not divisible by zero.")
      }
    }
  }

}
