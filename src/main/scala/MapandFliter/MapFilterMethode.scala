package MapandFliter

object MapFilterMethode {
  val lst = List(1,3,5,6,7,10,19);
  val myMap = Map(1->"Toby", 2->"Ray", 3->"Sam")
  def main(args: Array[String]): Unit ={
    println(lst.map(x=>x*2))
    println(lst.map(x=> "hi" * x))
    println(lst.map(_*2))
    println(lst.map(_/.2))
    println(myMap.map(y=> "hi" + y))
    println("hello".map(_.toUpper))              //just run the program and you will know whats it is doing
    println(List(List(1,2,3),List(3,4,5)))
    println(List(List(1,2,3),List(3,4,5)).flatten)//flatten
    println(lst.flatMap(x=>List(x,x+1)))//flatmap

    println(lst.filter(x=>x%2==0))//filter methode


  }

}
