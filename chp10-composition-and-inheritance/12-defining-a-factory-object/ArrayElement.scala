object Ex12 {
  //factory object/class combo

  object Element {
    def elem(contents: Array[String]): Element =
      new ArrayElement(contents)
    def elem(chr: Char, width: Int, height: Int): Element =
      new UniformElement(chr, width, height)
    def elem(line: String): Element =
      new LineElement(line)
  }

  abstract class Element {
    def contents: Array[String]
    val height = contents.length
    val width = if (height == 0) 0 else contents(0).length

    def above(that: Element): Element =
      new ArrayElement(this.contents ++ that.contents)

    def beside(that: Element): Element = {
      new ArrayElement(
        for (
          (line1, line2) <- this.contents zip that.contents
        ) yield line1 + line2
      )
    }

    override def toString = contents mkString "\n" //or alternatively: contents.mkString("\n")
  }

  class ArrayElement(val contents: Array[String]) extends Element

  class LineElement(s: String) extends Element {
    val contents = Array(s)
    override val width = s.length
    override val height = 1
  }

  class UniformElement(
                        ch: Char,
                        override val width: Int,
                        override val height: Int
                      ) extends Element {
    private val line: String = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  def main(args: Array[String]): Unit = {
    val lineElem = new LineElement("foo")
    println("lineElem [" + lineElem + "]")

    val zip1 =
      Array(1, 2, 3) zip Array("a", "b")
    val zip2 =
      Array((1, "a"), (2, "b"))
    println("zip1 [" + zip1 + "]")
    println("zip2 [" + zip2 + "]")
  }
}

