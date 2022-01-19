package ScalaFunc

import java.util.Date

object PartiallyFn {
  def log(date: Date, message: String) = {
    println(date + ":   : " + message)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(_: Int, 20, _: Int) //partially Applied Fn
    println(sum(10, 20, 30))
    println(f(35, 45))

    val date =new Date;
    val newlog = log(date,_:String)
    newlog("this is the message one")

    val sub = (x: Int, y: Int) => x - y
    println(sub(300, 500))
  }


}
