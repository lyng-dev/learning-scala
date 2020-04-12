//because the functional way of programming suggests that
// a developer breaks down the program into many small functions
// it can "pollute" the namespace of the program.
// if functions are only necessary in a certain area, then there
// is no reason to expose them everywhere.
// and approach to solve this is to nest functions inside other
// functions - this is called local functions

def processFile(filename: String, width: Int) = {

  def processLine(filename: String,
                  width: Int, line: String) = {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }

  val source = Source.fromFile(filename)
  for (line <- source.getLines()) {
    processLine(filename, width, line)
  }
}

// here processLine is defined inside processFile, so that it is
// only exposed where it is needed.

//but notice that the 'filename' and 'width' is passed on to the
// helper function. This can be simplified, because the enclosed
// function can see the enclosing functions variables.
// which gives us:

import scala.io.Source
object LongLines {
  def processFile(filename: String, width: Int) = {

    def processLine(line: String) =
      if (line.length > width) println(filename + ": " + line.trim)

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
