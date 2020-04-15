abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

//this is an example of polymorphism of Element
class ArrayElement(val contents: Array[String]) extends Element

//this is another example of polymorphism for Element
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override val width: Int = s.length
  override val height: Int = 1
}

//polymorphism means "many shapes" or "many forms"
// in this case, it means that "Element", can take many
// forms.
//we can extend further:
class UniformElement(
                    ch: Char,
                    override val width: Int,
                    override val height: Int
                    ) extends Element {
  private def line: String = ch.toString * width //NOTE: I have swapped 'val' for 'def', because it causes a sort of circular dependency. Using the method instead, works and is allowed because fields and methods live in the same namespace
  //the reason you are not overriding this, is because it's abtract, without implementatio
  //so it has to be implemented in each subclass
  def contents = Array.fill(height)(line)
}

//now we can do this:
val e1: Element = new ArrayElement(Array("hello", "world"))
val ae: ArrayElement = new LineElement("hello")
val e2: Element = ae
val e3: Element = new UniformElement('x', 2, 3)
