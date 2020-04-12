

//oteratopm through collections


//file system
val homeDirectory = (new java.io.File(".")).listFiles
for (file <- homeDirectory) println(file)

//ranges, to
for (i <- 1 to 4) println(i)

//ranges, until
for (i <- 1 until 4) println(i)

//uncommon way of iterating over file sin Scala
val homeDirectory = (new java.io.File(".")).listFiles
for (i <- 0 to homeDirectory.length - 1)
  println(homeDirectory(i))

//filtering, only show directories
val homeDirectory = (new java.io.File(".")).listFiles
for (file <- homeDirectory if file.isDirectory)
  println(file)

//imperative style of filtering
for (file <- homeDirectory)
  if (file.isDirectory)
    println(file)

//more filters
for (
  file <- homeDirectory
  if file.isDirectory
  if file.getName.startsWith("chp")
) println(file)

//nested iteration, if you add multiple <- you will create a nested loop
// you caan choose if you want to use braces or curly braces.
// They do the same.
val filesHere = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toArray

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(s"$file: ${line.trim}")
grep(".*file.*")

//midstream variable binding
val filesHere = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toArray

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(s"$file: $trimmed")
grep(".*file.*")

//producing a new collection, using yield
def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
