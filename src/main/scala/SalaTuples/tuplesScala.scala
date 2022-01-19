package SalaTuples

object tuplesScala {
  val my_tuple = (1,2,"hello", false,'c',12.88f)
  val mytuple = new Tuple5(3,4,"hello",'c', true)
  val my_tuples= new Tuple3('v',2,("hello",56))
  def main (args: Array[String]): Unit = {
    println(my_tuple)


  println(mytuple._3)
    println(my_tuples._2)

    my_tuple.productIterator.foreach{
      i =>println(i)

    }
    println(1 -> "Tom", true,'c',1,7)
    println(my_tuples._3._2)

  }

}
