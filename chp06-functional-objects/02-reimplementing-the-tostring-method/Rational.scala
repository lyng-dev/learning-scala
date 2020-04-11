

class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = s"$n/$d"
}

//test:

//val x = new Rational(1,3)

//require throws: if d == 0
//java.lang.IllegalArgumentException: requirement failed
//  at scala.Predef$.require(Predef.scala:268)
//  ... 29 elided
