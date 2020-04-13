

//little explanation
(x: Int) => x + more //x is a "bound" variable, more is a "free" variable.
//won't work.

//but this will

var more = 1
val addMore = (x: Int) => x + more
addMore(19)


//closure, because the function literal "closes" on the "more" variable.
val someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumbers.foreach(sum += _) //this short form function literal and placeholder updates the free variable (external), that is enclosed
println(sum)

//more advanced use of closure
def makeIncreaser(more: Int) = (x: Int) => x + more
val inc1 = makeIncreaser(1) //create a new closure
val inc9999 = makeIncreaser(9999) //creates a new closure
