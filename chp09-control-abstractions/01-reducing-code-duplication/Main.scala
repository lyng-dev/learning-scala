

//higher order function, are functions that take fucntions as an argument
//higher order functions enable you to create control abstractions
// and to condense and simplify code.

//1. a filematcher that can find filees ending in some string
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file
}

//2. extending to be able to search for contains in filename
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file
}

//3. extend with possibility to do RegEx search
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
}

//4. using function literal, and placeholder syntax, it's possible to make alot simpler
// with alot less duplication "boiler plate" code.
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String) = filesMatching(query, _.endsWith(_))
  def filesContaining(query: String) = filesMatching(query, _.contains(_))
  def filesRegex(query: String) = filesMatching(query, _.matches(_))
}
