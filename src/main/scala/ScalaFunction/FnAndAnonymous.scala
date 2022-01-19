package ScalaFunction

object FnAndAnonymous {
object math{
  def add(x: Int = 24, y: Int = 33): Int = {
    return x+y;
  }
}
  def print(x:Int, y: Int): Unit ={
    println(x+y);
  }
  def -(x: Int = 23, y: Int = 32): Int= y-x

  def main(args: Array[String]): Unit ={
    println(math.add())
    println(math.add(60))
    print(33,45)
    println(-(34))
    var add= (x:Int, y:Int)=> x+y
    println(add(300,500))

  }
}
