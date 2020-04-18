object Ex11  {
  abstract class Element {

    def contents: Array[String]

    def width: Int = {
      if (height == 0) 0 else contents(0).length
    }

    def height: Int = contents.length

    def above(that: Element): Element =
      new ArrayElement(this.contents ++ that.contents) //concatenate to arrays by using '++'

    def beside(that: Element): Element =
      new ArrayElement(
        for (
          (line1, line2) <- this.contents zip that.contents //merge two array [a,b] [c,d] => [(a,c),(b,d)] with zip
        ) yield line1 + line2
      )

    override def toString = contents mkString "\n"
  }

  class LineElement(s: String) extends Element {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
  }

  class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
  }

  def main(args: Array[String]): Unit = {
    val lineElem = new LineElement("foo")
    println("lineElem [" + lineElem + "]")

  }
}
