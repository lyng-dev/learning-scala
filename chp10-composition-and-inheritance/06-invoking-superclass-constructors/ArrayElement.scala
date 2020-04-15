abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element

//we can extend further, but if we extend further we need to call
// ArrayElements constructor, because it requires a parameter.
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override val width: Int = s.length
  override val height: Int = 1
}
//above, we call the constructor, by adding braces to the class we
// are extending, and specifying what we want to pass to the super-class
// constructor

