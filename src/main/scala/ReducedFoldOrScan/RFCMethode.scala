package ReducedFoldOrScan
//reduce left, reduce right, fold left, fold right, scan left, scan right
object RFCMethode {
  val lst =List(3,45,67,2,34,56,1)
  val Lst = List(4,56,54,34,67,2,32,5)
  val listing = List("a","b","c","d")
  def main (args: Array[String]): Unit ={
    println(Lst.reduceLeft(_+_))
    println(listing.reduceLeft(_+_))
    println(listing.reduceLeft((x,y)=>{println(x+" , "+y); x+y}))
    println(lst.reduceLeft((x,y)=>{println(x+","+y); x+y}))
    println(lst.reduceRight((x,y)=>{println(x+","+y); x-y}))
    println(Lst.reduceRight(_-_))

    //fold methode//
    println(lst.foldRight(0)(_-_))
    println(listing.foldLeft("z")(_+_))

    //scanLeft
    println(Lst.scanLeft(100)(_+_))
    println(listing.scanRight("z")(_+_))

  }

}
