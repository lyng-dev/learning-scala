abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element

//You don't want to use LineElement as-an ArrayElement, which means you
// but you want to use LineElement as-an Element, which means we ought to
// inherit from Element directly:
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
                      ch: Char,
                      override val width: Int,
                      override val height: Int
                    ) extends Element {
  private def line: String = ch.toString * width
  def contents = Array.fill(height)(line)
}
