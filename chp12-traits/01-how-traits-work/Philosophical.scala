trait Philosophical {
  def philosophize() = {
    println("I consume memory therefore I am!")
  }
}

class Frog extends Philosophical {
  override def toString = "green"
}

//now your frog can philosophize

val frog = new Frog()
frog.philosophize()
