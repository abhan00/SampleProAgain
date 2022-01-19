package Loops

import com.sun.tools.attach.VirtualMachine.list

object ForLoops {
  def main(array: Array[String]): Unit ={
    for(i <- 1 to 5){
      println(i)
    }
    //or
    for(j <- 6 until 10){
      println(j)
    }
    for (i <-1 until 4; j <- 1 until 3){
      println(i +" " + j)
    }
    val lst =List(1,2,3,4,5,6,7,8,9)
    for (i <-lst){
      println(" the lis of number is : " + i)
    }
    for (i <-lst; if i < 9){
      println(" then the i value will be : " + i)
    }
    val res = for {i <-lst; if i >= 3} yield{
      i*i
     }
      println(" value is : " + res)
    }

}
