package ScalaInheritance

abstract class Polygon {
  def area: Double
}
object polygons{
  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
  def main(args: Array[String]): Unit ={
    var poly = new Polygon {
      override def area: Double = 0.00
    };
    printArea(poly)

    var rectangle = new Rectangle(34, 32)
    println(rectangle.area)
    println(rectangle.perimeter(25,60))
    var triangle = new Triangle
    println(triangle.area)
  }

}
// to make a class abstraxct we define abstract as in java
