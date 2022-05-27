package Part1Basics

object DefaultArgs extends App {

  def defaultArgsTest(n: Int, acc: Int = 1): Int = {
    if (n <= 0) acc
    else defaultArgsTest(n - 1, n * acc)
  }

  println(defaultArgsTest(10))

  println(defaultArgsTest(10, 2))

  //when any default paramenetr is passed like acc = 1 in above case then there is no necessary to pass the argument while calling the same function
  // but we can still want to pass then we can, in that case default parameter value get overriden by the new value like 2 is get overriden by 1

  def savePicture(format: String = "jpg",
                  width: Int = 800,
                  height: Int = 900): Unit =
    println("save picture")

  //savePicture(800,900) copiler will throe error as it get confused which parameters value he will replace with 800 or 900

  savePicture("bnp") // the solution is passing evry leading argument

  savePicture(width = 700) //another if yu want to specifically change the value of some parameter then mentione the name of the parameter with the new value
  // so copiler can understande which value he has to replace with the new one

  savePicture(height = 500, format = "ij", width = 200) // by specifying name of the parameter you can also change the order of the parameter

  savePicture() //if all parameter has their default argumes set then no need to metion it again
}
