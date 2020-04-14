var assertialsEnabled = true

def myAssert(predicate:  => Boolean) =
  if (assertialsEnabled && !predicate
    throw new Exception()

myAssert(2 > 7)
