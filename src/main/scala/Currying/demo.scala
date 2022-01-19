package Currying
/*Currying is a technique of transforming a function
* it take multiple argument into a function
* that takes a single argument*/
object demo {
def add(x:Int,y:Int): Int = x+y

  def add1(x:Int) (y:Int)= x+y // SIMPLER WAY TO USE CURRYING FN

  def adding(x:Int) =(y:Int)=> x+y

  def main(args: Array[String]): Unit ={
    println(adding(45)(55))
    val sum =adding(55)
    println(sum(78));
    println(add1(23)(33))
    println(add(34,67));
    val sum1 = add1(30)_;
    println(sum1(400))
  }
}
