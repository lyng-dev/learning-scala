

//if can be used as an expression
val x = "test"
println(if (x == "test") s"contains $x" else "does not contain test")

//A benefit of using a val, is that you can use it's value as output,
// because you know what value it will hold.
// this cannot be assumed with a variable.
