
object Ex12  {
  import Element.elem

  abstract class Element {

    def contents: Array[String]

    def width: Int =
      if (height == 0) 0 else contents(0).length

    def height: Int = contents.length

    def above(that: Element): Element =
      elem(this.contents ++ that.contents)

    def beside(that: Element): Element =
      elem(
        for (
          (line1, line2) <- this.contents zip that.contents
        ) yield line1 + line2
      )

    override def toString = contents mkString "\n"
  }

  object Element {

    def elem(contents: Array[String]): Element =
      new ArrayElement(contents)

    def elem(chr: Char, width: Int, height: Int): Element =
      new UniformElement(chr, width, height)

    def elem(line: String): Element =
      new LineElement(line)
  }

  private class ArrayElement(conts: Array[String]) extends Element { //can not be private
    def contents: Array[String] = conts
  }

  private class LineElement(s: String) extends ArrayElement(Array(s)) { //can not be private
    override def width = s.length
    override def height = 1
  }

  private class UniformElement( //can not be private
                        ch: Char,
                        override val width: Int,
                        override val height: Int
                      ) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  def main(args: Array[String]): Unit = {
    val lineElem = new LineElement("foo")
    println("lineElem [" + lineElem + "]")
  }
}
