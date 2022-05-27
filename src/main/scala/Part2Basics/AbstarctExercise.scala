package Part2Basics

abstract class MyList {

  def head: Int

  def tail: MyList

  def isEmpty: Boolean

  def add(elem: Int): MyList
  def printELement: String
  override def toString = "[" + printELement + "]"
}
object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(elem: Int): MyList = new Conns(elem, Empty)

  override def printELement: String = ???
}

class Conns(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(elem: Int): MyList = new Conns(elem, this)

  override def printELement: String =
    if (t.isEmpty) " " + h
    else h + " " + t.printELement.toString
}

object ListTest extends App {
  val list = new Conns(1, new Conns(2, new Conns(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)
  println(list.printELement)
}
