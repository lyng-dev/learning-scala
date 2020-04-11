

class Rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d
  require(d != 0)
  override def toString = s"$n/$d"
  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, d * that.denom)
}

//test:

//val x = new Rational(1,3)

//require throws: if d == 0
//java.lang.IllegalArgumentException: requirement failed
//  at scala.Predef$.require(Predef.scala:268)
//  ... 29 elided
