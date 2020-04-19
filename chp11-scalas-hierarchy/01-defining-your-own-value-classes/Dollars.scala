class Dollars(val amount: Int) extends AnyVal {
  override def toString() = "$" + amount
}

class SwissFrancs(val amount: Int) extends AnyVal {
  override def toString() = s"$amount CHF"
}
