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

//you can mix in traits, AND also extend at the same time.

class Animal
trait Philosophical {
  def philosophize() = {
    println("I consume memory therefore I am!")
  }
}
class Frog extends Animal with Philosophical {
  override def toString() = "green"
}

//you can override a trait
class Animal
trait Philosophical {
  def philosophize() = {
    println("I consume memory therefore I am!")
  }
}
trait VeryPhilosophical {
  def philosophize() = {
    println("I consume memory therefore I am!")
  }
}
class Frog extends Animal with Philosophical {
  override def toString() = "green"
  override def philosophize() = println("I'm not ready to answer that question!")
}

//traits can do what class definitions can, but they cannot:
// - Have any class parameters (they are not classes, and cannot be used that way)
//  You can wwork around this limitation though, see 20.5
// - super calls are statically bound, whereas in traits they are dynamically bound
// a pretty decent description:
//  https://www.geeksforgeeks.org/difference-between-traits-and-abstract-classes-in-scala/

//traits are stackable, meaning, you can add multiple:

class Animal
trait Philosophical {
  def philosophize() = {
    println("I consume memory therefore I am!")
  }
}
trait VeryPhilosophical {
  def veryDeep() = {
    println("Time flies like an arrow, fruit flies like a banana!")
  }
}
class Frog extends Animal with Philosophical with VeryPhilosophical {
  override def toString() = "green"
}

val philosophicalFrog = new Frog
println(philosophicalFrog.philosophize())
println(philosophicalFrog.veryDeep())
