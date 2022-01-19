package Optiontypes
// option can give us two kind of result some or none
object OptionTypes {
  val lst = List(1,2,3)
  val map =Map(1->"tom", 2->"ram",3->"tim")
  val opt :Option[Int] = Some(3);
  val opt1 : Option[String] = None;
  def main(args: Array[String]): Unit ={
    println(lst.find(_ >2)); // some
    println(lst.find(_ >4)); // none
    println(lst.find(_ >1).get);
    println(map.get(1))
    println(map.get(3).getOrElse(println("nothing to display")))
    println(opt.isEmpty)
    println(opt1.isEmpty)





  }

}
