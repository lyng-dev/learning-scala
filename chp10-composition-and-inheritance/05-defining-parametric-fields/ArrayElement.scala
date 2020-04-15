abstract class Element {
  def contents: Array[String]
  val height = contents.length
  val width = if (height == 0) 0 else contents(0).length
}

class ArrayElement(
  c: Array[String] //code smell: We could not choose the same name as the field.
                   // and signals perhaps some redundancy in code.
                   // use parametric fields to resolve this.
) extends Element {
  val contents: Array[String] = c
}

//here we are saying:
// let contents take a parameter 'conents', which is an Array[String]
// and also let the class have a field of the same name and type, which is
// populated by the constructor parameter contents.
class ArrayElementParametric(val contents: Array[String]) extends Element

//because we use 'val', then the field 'contents' is immutable
// we can also use 'var', to make it mutable.

//you can also add access modifiers, like you can for any other fields:
// like so:
class Cat {
  val dangerous = false
}

class Tiger(
             override val dangerous: Boolean,
             private var age: Int
           ) extends Cat

//Tiger could also be defined:
class Tiger(isDangerous: Boolean, theAge: Int) extends Cat {
  override val dangerous: Boolean = isDangerous
  private var age: Int = theAge
}
