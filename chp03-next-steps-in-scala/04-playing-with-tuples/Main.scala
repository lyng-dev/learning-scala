//tuples are like list in that they are immutable, and
//can contain multiple items
//tuples are unlike a list in that they can contain
//different type items, like String and Int together

val pair = (99, "Luftballons")


//another example
val love = ('u', "r", "the", 1, "4", "me")

//you can't access the elements like in a list or an array,
// That's because the apply-method always maps to one type.
// and in the case of a tuple, we can't guarantee that.

love(2) //Fail: does not work

//tuples are btw, counted from 1 and onwards, and not 0 onwards
// because that is a tradition for statically typed tuples
// in other languages as Haskell and ML
