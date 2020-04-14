import scala.reflect.io.File

//1. this
def twice(func: Double => Double, x: Double) = func(func(x))
twice(_ + 1, 5)

//2. is the same as this:
def twice(func: Double => Double, x: Double) = func(func(x))
twice(input => input + 1, 5)


//3. ANother type of control structure
//Can be used as (This is called the Loan Pattern):
//https://blog.knoldus.com/scalaknol-understanding-loan-pattern/
//https://whileonefork.blogspot.com/2011/03/c-using-is-loan-pattern-in-scala.html

//4. A very simply greeter control structure
def greet(greeting: String)(func: String => Unit) {
  func(greeting)
}

greet("Hello") {
  println(_)
}
