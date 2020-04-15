//FINAL MEMBERS:
//if we want to ensure that a user cannot override an implementation, then
// we can mark the implementation as final, meaning, there can be no other
// implementation than the one we have defined. It is FINAL.
// for instance:
abstract class Element {
  def demo() = {
    println("Element's implementation invoked")
  }
}
class ArrayElement extends Element {
  final override def demo() = { //we define this implementation as final, so LineElement CAN'T override it.
    println("ArrayElement's implementation invoked")
  }
}
class LineElement extends ArrayElement {
  override def demo() = { //ERROR, this won't be allowed.
    println("LineElement's implementation invoked")
  }
}
class UniformElement extends Element
def invokeDemo(e: Element) = {
  e.demo()
}

//the same thing can be done for classes.
// Lets say you didn't want to allow ArrayElement
// to be used as super class, thus not allowing sub-classing
// from it.
//then this is how to not allow LineElement to derive from it.
abstract class Element {
  def demo() = {
    println("Element's implementation invoked")
  }
}
final class ArrayElement extends Element {
  override def demo() = { //we define this implementation as final, so LineElement CAN'T override it.
    println("ArrayElement's implementation invoked")
  }
}
class LineElement extends ArrayElement { //ERROR, this won't be allowed.
  override def demo() = {
    println("LineElement's implementation invoked")
  }
}
class UniformElement extends Element
def invokeDemo(e: Element) = {
  e.demo()
}
