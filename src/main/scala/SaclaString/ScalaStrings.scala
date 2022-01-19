package SaclaString

object ScalaStrings {
  val s : String = "Hello World"
  val s1: String =" max"
  val num1 = 10;
  val num2 = 12.00f;
  def main(args: Array[String]): Unit ={
    println(s.length())
    println(s.concat(s1))
    println(s+s1)
    val result = printf("(%d -- %f --%s)",num1,num2,s)
    println(result)
    println("(%d -- %f --%s)".format(num1,num2,s))
  }

}
