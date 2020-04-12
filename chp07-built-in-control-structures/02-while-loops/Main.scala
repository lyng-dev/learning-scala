
// while loop example
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

gcdLoop(174345, 99)
//--------------------------------------

//do while example
var line = ""
do {
  line = scala.io.StdIn.readLine()
  println("Read: " + line)
} while (line != "")
//--------------------------------------

//Be suspicious of while-loops because they generally mean
// that there are side-effects
