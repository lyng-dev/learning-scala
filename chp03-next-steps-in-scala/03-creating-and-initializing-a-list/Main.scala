


val oneTwoThree = List(1,2,3)

//this is not allowed

oneTwoThree(1) = 2



// it's not possible to mutate a List, but you can join two lists into a third list
// similar to how strings work in Java

val oneTwo = List(1,2)
val threeFour = List(3,4)

//concatenate using the ':::' method on List
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated")
println("Thus, " + oneTwoThreeFour + " is a new list.")
