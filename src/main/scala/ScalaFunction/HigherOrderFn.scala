package ScalaFunction

import scala.Console.println

object HigherOrderFn {
  def math(x: Double,y:Double,z: Int,f:(Double, Double)=>Double): Double = f(f(x,y),z)
def main(args: Array[String]): Unit ={
  val res = math(50,20,10,(x,y)=>x + y) // 80
  println(res)
  val res2 = math(45,50,50,_+_) // here underscore means wildcard in scala //145
  println(res2)

}
}
