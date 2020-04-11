

class Rational(n: Int, d: Int)
{
  //this will be compiled into the primary constructor because
  // it is not part of a field or method definition and is
  // located in the class body. This is allowed in Scala
  // and that is why <class> extends App, allows for not having
  // a main in the class definition, because that is added as a trait.
  println(s"Created this Rational(${n}, ${d}) = $n / $d")
}
