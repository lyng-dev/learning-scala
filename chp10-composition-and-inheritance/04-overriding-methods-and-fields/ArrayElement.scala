abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

//in Scala, fields and methods belong to the same namespace.
// that makes it possible for a field to override a parameterless
// method.
// for instance:
class ArrayElement(c: Array[String]) extends Element {
  val contents: Array[String] = c
}

//here the field "val contents" overrides the method "contents"
// from it's super-class

//There since fields and methods live in the same namespace, you cannot
// name a field and a method the same name.
//for instance, this is illegal:
class WontCompile {
  def f: String
  val f: String
}

//scala only has 2 namespaces, where Java has 4.
// A: Values /fields, methods, packages and singleton objects)
// B: GTypes: class and trait names
