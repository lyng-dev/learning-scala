

//REPEATED PARAMETERS AND _*
//functions allow that you indicate that the last parameter may be repeated
//use the * to incidate that, like so:
def echo(args: String*) =
  for (arg <- args) println(arg)

echo()
echo("Hello")
echo("Hello", "World")
echo("Hello", "outside", "World!")

//what is actually happening is that String* is turned into
// a Sequence, Seq[String] liek this:
val seq = Seq("What's", "up", "doc?")
echo(seq: _*) //this tells the compiler to pass each element of a Seq as it's own arugment to echo
              //instead of as a single argument

//NAMED PARAMETERS
//there is nothing difficult about this, ... you can pass arguments as named parameters
//meaning you don't have to follow the order of parameters
def speed(distance: Float, time: Float): Float =
  distance / time
speed(100, 10) //normal, you have to follow the order
speed(time = 20, distance = 1000)  //named, you can ignore order

//DEFAULT PARAMETERS
//you can default-value a parameter, meaning you can choose to leave it out
def printTime2(out: java.io.PrintStream = Console.out,
               divisor: Int = 1) =
  out.println("time = " + System.currentTimeMillis()/divisor)

//TAIL RECURSION
//Functions that call themselves as the last thing, are call TAIL RECURSIVE
//And the compiler can optimize these.
//The compiler can detect the end of the function, and can return to the top of the function
//instead of creating a new function, and instead updating the parameter values.
//this faster and uses less resources than calling the same function
def approximateLoop(initialGuess: Double): Double = { //this function cannot be improved by the compiler
  var guess = initialGuess
  while (!isGoodEnough(guess))
    guess = improve(guess)
  guess
}
def approximate(guess: Double): Double =  //this function CAN be improved for performance by the compiler.
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))

//THIS IS NOT TAIL RECURSIVE, because it performs an addition after the recursive call
def boom(x: Int): Int =
  if (x == 0) throw new Exception("boom!")
  else boom(x - 1) + 1

//THIS IS TAIL RECURSIVE:
def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!")
  else bang(x - 1)

//A language like C# does not support Tail recursion.Not because they couldn't but because the language
//designers specifically chose not to. Instead look at: Trampolining: https://volgarev.me/2013/09/27/tail-recursion-and-trampolining-in-csharp.html


