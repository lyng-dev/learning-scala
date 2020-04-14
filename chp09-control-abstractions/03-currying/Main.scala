//CURRYING

//1. A plain old function
def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1, 2)


//2. A curried function
def curriedSum(x: Int)(y: Int) = x + y
curriedSum(1)(2)


//3. This does the same in spirit. It calls one function, and then returns another function
def first(x: Int) = (y: Int) => x + y
val second = first(1)
second(2)

//4. more
def curriedSumAlternate(x: Int)(y: Int) = x + y
val onePlus = curriedSumAlternate(1)_
onePlus(2)

//5. And how to get a function that adds two
val twoPlus = curriedSumAlternate(2)_
twoPlus(2)
