package Part2Basics

object InheritanceANdTraits extends App {

  class Animal {
    protected def eat = println("eat")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("cruch method")
    }
  }

  val cat = new Cat
  cat.crunch
}
