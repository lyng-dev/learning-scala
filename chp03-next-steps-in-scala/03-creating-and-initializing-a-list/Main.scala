


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


///More list examples

val anEmptyList = List()
val anotherEmptyList = Nil

val threeItemList = List("A", "B", "C")

val moreItems = "This" :: "Is" :: "A" :: "Long" :: "List" :: Nil

val concatList = threeItemList ::: moreItems

concatList(2) //returns item at second index

concatList.count(item => item.length == 4) //count the items that have a length of 4

concatList.drop(2) //return a list dropping the two first items

concatList.dropRight(2) //return a list dropping the two last items

concatList.exists(item => item == "List") //return a boolean indicating if an item exists with the value "List"

concatList.filter(item => item.length == 4) //return list that contains only items of length 4

concatList.forall(item => item.endsWith("s")) //returns a boolean indicating if all items ends in s

concatList.head //returns the first element in list

concatList.init //returns all BUT the last element

concatList.isEmpty //returns a boolean indicating if the list is empty

concatList.last //returns the last element in the list

concatList.length //returns an Int indicating the length of the list

concatList.map(item => item + "y") //maps each item in the list to a new list of items where "y" is appended

concatList.mkString(" AN DEN ") //returns a string concatenating all items, using the argument as the item-seperator
println("NO MORE AN DEN!!!!!!")

concatList.filterNot(item => item.length == 4) //reverse filter, returning those that do not match length 4

concatList.reverse //returns the list inverted

concatList.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower) //sort alphabetically, by first character

concatList.tail //returns the list minus it's first element
