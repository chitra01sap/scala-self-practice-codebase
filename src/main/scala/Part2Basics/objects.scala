package Part2Basics

import com.sun.jndi.ldap.PersistentSearchControl

import java.beans.DesignMode

object objects extends App {

  //SALA DOES NOT SUPPORT CLASS LEVEL FUNCTIONALITY (STATIC KEYWORD)
  // TO USE CLASS LEVEL DEFINITION IN SCALA WE USE OBJECT

  object demo {
    val x = 2
    val fly = "fly"
  }

  println(demo.x)
  println(demo.fly)

  //scala object used as a singlton object

  val maary = demo
  val tom = demo
  println(maary == tom) // true scala objects are the singlton instances by definition
}
