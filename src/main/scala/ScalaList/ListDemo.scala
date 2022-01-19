package ScalaList

import scala.::

object ListDemo {
  val mylist: List[Int] = List(1,2,3,5,7,9,0)
  val names: List[String] = List("Ram","Shayam","Ghanramshyam")
  def main(args: Array[String]): Unit ={
    println(0 :: mylist)
    println("maya"::names)
    println(mylist.head)
    println(names.tail)
    println(names.isEmpty)
    println(mylist.reverse)
    println(List.fill(5)(3))

    mylist.foreach(println)
    names.foreach(println)
    var sum :  Int =0;
    mylist.foreach(sum += _)
    println(sum)
    for (name <-names){
      println(name)
    }

    }



}
