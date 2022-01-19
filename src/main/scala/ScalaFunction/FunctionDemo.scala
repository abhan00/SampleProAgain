package ScalaFunction



//function is a group of statement to finish a particular task
object FunctionDemo {
  //new object
  object math{
    def modulus(x: Double, y: Double) : Double = x % y

    def sqr(x : Int) : Int = x*x
  }


  //this is how we provide function
  // this the basic rule of writing a fn in scala
  def add(x : Int, y : Int ) : Int = {
    return x + y
  }
  def sub(x : Int, y : Int ) : Int = {
    x - y
  }
  def div(x : Float, y : Float ) : Float = x / y

  def mul(x : Int, y : Int ) : Int = x * y



  def main(args: Array[String]): Unit ={
    println(add(34,54))
    println(div(67,23))
    println(mul(45,20))
    println(sub(55,13))
    println("-----------------------")
    println(math.modulus(132,23))
    println("-----------------------")
    println(math sqr 3)

  }

}
