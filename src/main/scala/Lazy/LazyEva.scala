package Lazy

class Strict{
  val e={
    println("strict")
  }
}
class lazyEval{
  lazy val l = {
    println("lazy")
  }
}
object LazyEva {
def main(args: Array[String]): Unit ={
val x = new Strict
val y = new LazyEval
println(x.e)
  println(y.l)
}
}
