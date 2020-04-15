abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override val width: Int = s.length
  override val hight: Int = 1 //Notice misspelling: this will break the compilation, because you cannot override something that doesn't exist.
}

//if you add a field or method that will shadow an underlying field
// or method, then you will also get a compilation error.
// for instance:
class Shape {
  val hidden: Boolean = false
}

class Triangle extends Shape {
  def hidden: Boolean = true
}

//this will not compile
