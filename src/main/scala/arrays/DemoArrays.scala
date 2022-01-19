package arrays

import Array._
// arrays is the collection of same data types
object DemoArrays {
  var myArray : Array[Int] = new Array[Int](6)
  var myArray1 = new Array[Int](3)
  var arr =Array(3,4,56,789,5,6,7)
def main (args: Array[String]): Unit ={
  myArray(0) =23;
  myArray(1) =29;
  myArray(2) =28;
  myArray(3) =26;
  myArray(4) =24;
  myArray(5) =22;

  myArray1(0) =45
  myArray1(1) =46
  myArray1(2) =47
  for(x <- myArray){
    println(x)
  }
  println("---------------")

  for(i<-0 to (myArray1.length-1)){
    println(myArray1(i))

  }
  println("                             ----------------")
  println(arr.length)
  for(a<-arr){
    println(a)
  }
  println("%s%s%s".format(myArray1, myArray1, arr))

  val result = concat(myArray1,myArray,arr)
  for (b <- result){
    println(b)
  }


}
}
