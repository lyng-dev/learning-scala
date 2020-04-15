
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

//notice the methods have no (), these are called parameterless methods.
// the convention is to use them when both is true:
// A: There are no parameters (goes without saying)
// B: When the method accesses mutable state only by reading fields
//    of the containing object, IN PARTICULAR, it DOES NOT CHANGE state.
// This supports the uniform access pricinple. which says the client
// code should not be affected by a decision to implement an attribute as
// a field or method.

// That means we could have implemented 'width' and 'height' as fields instead
// with the same result.

abstract class ElementWithFields {
  def contents: Array[String]
  //field instead of parametersless method
  val height = contents.length
  //field instead of parametersless method
  val width = if (height == 0) 0 else contents(0).length
}

//the fields might be quicker, but it also requires more memory.
// You should consider the usage profile.
// But Element works the same from a client-code perspective.

//Further convention:
// is good style to use () on parameterless methods, when the called method
//  does more than just act as a property(i.e. feed some value).
// for instance if you perform some I/O operation, then use the ()'rized version
"hello".length //good
println() //good, because it has side-effects
