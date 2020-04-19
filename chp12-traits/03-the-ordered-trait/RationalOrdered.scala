import scala.language.implicitConversions

class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)
  def this(i: Int) = this(i, 1)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n/g
  val denom: Int = d/g

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def add(that: Rational): Rational =
    new Rational(this.numer * that.denom + that.numer * this.denom, denom * that.denom)
  def +(that: Rational): Rational = add(that)
  def +(i: Int): Rational = add(new Rational(i,1))

  def subtract(that: Rational): Rational =
    new Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)
  def - (that: Rational): Rational = subtract(that)
  def - (i: Int): Rational = subtract(new Rational(i,1))

  def multiply(that: Rational): Rational =
    new Rational(this.numer * that.numer, this.denom * that.denom)
  def * (that: Rational): Rational = multiply(that)
  def * (i: Int): Rational = multiply(new Rational(i,1))

  def divide(that: Rational): Rational =
    new Rational(this.numer * that.denom, this.denom * that.numer)
  def / (that: Rational): Rational = divide(that)
  def / (i: Int): Rational = divide(new Rational(i,1))

  //added from self-reference section
  def lessThan(that: Rational):Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }

  override def toString = s"${this.numer}/${this.denom}"

  //WARNING: You must run this in the interpreter directly for now
  // because the implicit def needs to be in scope.
  // more to come on this later.
  implicit def intToRational(x: Int) = new Rational(x)
}
