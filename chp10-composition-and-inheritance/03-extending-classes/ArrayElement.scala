abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

//WHen a class "extends" another class, it's just like in Java
class ArrayElement(c: Array[String]) extends Element {
  def contents: Array[String] = c
}

//what happens is that ArrayElement inherits everything Element can do,
// and it makes ArrayElement a Sub-Type of Element
// so now ArrayElement is a sub-class of Element. And Element is a superclass
// of ArrayElement

//if you left out any extends, then it would extend scala.AnyRef, so that means
// Element actually extends scala.AnyRef
val ae = new ArrayElement(Array("hello", "world"))
ae.width

//subtyping means that a sub-type can be used whenever a super-class is required.
//for instance:
val e: Element = new ArrayElement(Array("sub-type"))
