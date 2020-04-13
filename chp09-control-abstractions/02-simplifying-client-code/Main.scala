
//Let's simplify some client code

//1. Naive approach
def containsNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}

//2. A better approach is to call the higher-order function .exists on the list
def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

//2cont. is an example of a control-abstraction. It is a special-purpose looping
// construct provided by the Scala library, instead of using while or for.4

//3. if you wanted to add a containsOdd function, without having higher-order functions
// as which are control abstractions, you'd have to do this_:
def containsOdd(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num % 2 == 1)
      exists = true
  exists
}

//4. But instead you can just do this:
def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1) //if returns 1, then it's odd

//5. going all in:
object NumberFinder {
  def finder(nums: List[Int], query: List[Int] => Boolean) = query(nums)
  def containsNeg(nums: List[Int]) = finder(nums, _.exists(_ < 0))
  def containsOdd(nums: List[Int]) = finder(nums, _.exists(_ % 2 == 1)) //if returns 1, then it's odd
}
