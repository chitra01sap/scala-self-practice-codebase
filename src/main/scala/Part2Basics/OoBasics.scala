package Part2Basics

object OoBasics extends App {

  val person = new Person("chitra", 25)
  println(person.age)
  println(person.greet("pooja"))
  println(person.greet())
  val author = {
    new Writer("writer1", "writer2", 1997)
  }
  val novel = new Novel("great expectations", 2022, author)
  println(novel.authorAge)
  println(novel.writtenBy(author))
  println(novel.copy(1978))
  println(author.fullName)

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print

  counter.desc.desc.print
  counter.desc(10).print
  // so now whenever we istantiate class it must be necessary to pass the argument
  // to access the age we can't use person.age as name & age are not a fileds(class members) they are the class parameters
  // to access class parameters we have to specify val
  //it means parameter & fileds are two different thhings, you can convert parameter to field by adding val

  class Person(val name: String, val age: Int) { // it's a constructor having parameters passed to the same constructor

    val x = 2 // fileds

    def greet(name: String): Unit = {
      println(s"${this.name} says Hi, ${name}")
    }

    //overloading

    def greet(): Unit = {
      println(s"Hi I am, $name")
    }

    /*
    Novel and Writer
    Writer -first name,surname,year
    method -fullname

    Novel - name , year of release, author
    - author age
    -isWrittenBy(author)
    -copy(new year of release) = new instance of novel
     */

    /*
    Counter class
    -receive an int value
    -method current count
    -method to incremen/decrement=>new counter
    -overload inc/dec to receive an amount
   */
  }

  class Writer(firstName: String, lastName: String, val year: Int) {
    def fullName: String = firstName + " " + lastName
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge = year - author.year

    def writtenBy(author: Writer) = author == this.author

    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  class Counter(cnt: Int = 0) {
    def inc = {
      println("Incrmenting")
      new Counter(cnt + 1)
    }

    def desc = {
      println("Decrementing")
      new Counter(cnt - 1)
    }

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n - 1)
    }

    def desc(n: Int): Counter = {
      if (n <= 0) this
      else desc.desc(n - 1)
    }

    def print = println(cnt)

  }

}
