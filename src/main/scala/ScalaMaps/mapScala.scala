package ScalaMaps

object mapScala {
  val my_map : Map[Int, String] = Map(801-> "Anjani", 802 -> "tom", 803 -> "Jenni")
  val my_maps : Map[Int, String] = Map(805-> "kriti", 806 -> "tommy", 807 -> "Jennifer")
  def main (args: Array[String]): Unit ={
    println(my_map)
    println(my_map(801));
    println(my_map.keys)
    print(my_map.values)
    println()

    my_map.keys.foreach{key =>
      println("key:  " + key)
      println("value: " +my_map(key))
    }
    println(my_map++my_maps)
    println(my_map.contains(801))
  }

}
