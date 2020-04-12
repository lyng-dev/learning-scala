class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  //added from auxiliary constructor
  //auxiliary constructor
  def this(i: Int) = this(i, 1)

  override def toString = s"$numer/$denom"
  def add(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, d * that.denom)

  //added from self-reference section
  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this.lessThan(that)) that
    else this
}
