package Sacala

import scala.collection.mutable


object sets {
  val Masts : Set[Int] = Set(1,2,4,5,6,7,3,5,6,7,8,9,2)
  val names: Set[String] = Set("Ram", "shyam", "Ram", "kriti")
  var mysets: mutable.Set[Int] = scala.collection.mutable.Set(2,5,6,78,9,0,5)

  def main (args: Array[String]): Unit ={
    println(Masts +18)
    println(names + "anjani")
    println(mysets + 18)
    println(mysets(5))// to test if 5 is on set or not // true
    println(Masts.head)
    println(mysets.tail)
    println(names.isEmpty)
    //concatenate
    println(mysets ++ Masts)
    println(mysets .++ (Masts))

    mysets.foreach(println)
    for(name <- names){
      println(name)
    }



  }

}
