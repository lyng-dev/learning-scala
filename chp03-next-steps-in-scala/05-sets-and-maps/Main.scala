

//in scala you generally choose between mutable or immutable Maps and Sets
// scala has different traits (that is sort of like an Interface, but with
// an implementation), for mutable or immutable Sets or Maps.


//Creating, initializing and using a immutable set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

//alternatively
var jetSet = scala.collection.immutable.Set.apply("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

//Creating, initializing and using an mutable set
val jetSet = Set("Boeing", "Airbus")
jetSet + "Lear"
println(jetSet.contains("Lear"))

//alternatively
val jetSet = scala.collection.mutable.Set.apply("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Lear"))

// += is a shorthand for jetSet = jetSet + <object>

//immutable Hashset
import scala.collection.immutable.HashSet
val hashSet = HashSet("Fried", "Green", "Tomatoes")
println(hashSet + "And Cheese")


//---------------------------------------------
//Maps

import scala.collection.mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to the island")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Profit")
println(treasureMap(2))

//immutable version
val treasureMap = Map(
  1 -> "Go to the island",
  2 -> "Find big X on ground",
  3 -> "Profit"
)
println(treasureMap(2))
