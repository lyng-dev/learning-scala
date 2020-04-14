var assertiosnEnabled = true

def myAssert(predicate:  => Boolean) =
  if (assertiosnEnabled && !predicate) throw new Exception else true

myAssert(2 < 7)


def byNameAssert(predicate: => Boolean) = {
  println("inside byNameAssert")
  if (assertiosnEnabled && !predicate)
    throw new Exception
  println("After predicate in byNameAssert")
}

byNameAssert({val x = 2 < 7; println("After comparison in predicate"); x})
