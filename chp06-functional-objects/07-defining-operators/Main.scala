class Rational(n: Int, d: Int) {
  require(d != 0)
  def this(i: Int) = this(i, 1)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n/g
  val denom: Int = d/g

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def + (that: Rational): Rational = add(that)

  def add(that: Rational): Rational = {
    new Rational(this.numer * that.denom + that.numer * this.denom, denom * that.denom)
  }

  def multiply(that: Rational): Rational =
    new Rational(this.numer * that.numer, this.denom * that.denom)

  def * (that: Rational): Rational = multiply(that)

  //added from self-reference section
  def lessThan(that: Rational):Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }

  override def toString = s"${this.numer}/${this.denom}"
}
