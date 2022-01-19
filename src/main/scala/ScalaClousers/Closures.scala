package ScalaClousers
//closures is one or more variables declare outside the fn//
object Closures {
  var num = 10;
  val add =(x: Int)=> x + num;
  def main (args: Array[String]): Unit ={
    num = 100;
    println(add(35));
  }

}
