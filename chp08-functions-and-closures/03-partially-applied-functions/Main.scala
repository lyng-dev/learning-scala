
//partially applied syntax
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach(println _) //this is placeholder and partially applied syntax together
someNumbers.filter(_ > 0) //this is placeholder syntax and short form function literal together

//more advanced partially applied syntax
def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1, 2, 3)

//this
def sum(a: Int, b: Int, c: Int) = a + b + c
val a = sum _
a(2,3,4)

//is the same as:
def sum(a: Int, b: Int, c: Int) = a + b + c
val a = sum _
a.apply(2,3,4)

//you can also apply SOME of the parameters
def sum(a: Int, b: Int, c: Int) = a + b + c
val a = sum(2, _: Int, 4)
a(3)
