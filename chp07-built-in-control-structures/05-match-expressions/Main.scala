//match expression let's you select among a list of alternatives...
val options = List("A", "B", "C", "salt")
for (o <- options)
  o match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }
