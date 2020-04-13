val increase = (x: Int) => x + 1

increase(22)


//you can make multi-line functions as function literals

val increase = (x: Int) => {
  println("We")
  println("are")
  println("here!")
  x + 1
}
increase(22)


//using function literals ie. function values as input
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))

//filter method that takes a function literal, and if it matches, then removes it from the collection
someNumbers.filter((x: Int) => x > 0)

//sshort form of function literals
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter(x => x > 0)

//placeholder syntax
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach(println(_))
someNumbers.filter(_ > 0)
