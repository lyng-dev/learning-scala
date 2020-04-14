var assertiosnEnabled = true

def myAssert(predicate:  => Boolean) =
  if (assertiosnEnabled && !predicate) throw new Exception else true

myAssert(2 < 7)
