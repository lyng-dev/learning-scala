

class Rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d
  require(d != 0)
  override def toString = s"$n/$d"
  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, d * that.denom)

  //added from self-reference section
  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this.lessThan(that)) that
    else this

}
