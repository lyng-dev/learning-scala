


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


// Another very popular concatenation technique is
// using the :: ('Cons') method on a list.
// it prepends an element to the beginning
// of a list

val twoThree = List(2,3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

//rule to remember: if a method (here ::) end in a colon ':' , then the operation in
// done against it's right operand. If it does not, like a * b, where '*' is the operator
// then the operation is done le

//You can chain together methods like this, to generate a List

val oneTwoThree = 1 :: 2 :: 3 :: Nil

//the reason this works, is because :: is a valid operator of Nil, thereby creating a List
// that can then subsequently be called on the other invocations of ::
// if Nil was not in the list, then this would fail, because :: is not a valid method of Int


////---------------------------------
//You can append to lists, using the ':+' operator, but it's more
//expensive (linear) to append, rather than pre-pending, which
//creates a new list, takes constant time.
val appendedList = 1 :: Nil
appendedList:+ 3
