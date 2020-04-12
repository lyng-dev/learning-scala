import java.net.URL
import java.net.MalformedURLException
def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

//here f() returns 2
def f(): Int = try return 1 finally return 2

//here g() returns 1
def g(): Int = try 1 finally 2

//you should avoid returning anything from finally blocks
