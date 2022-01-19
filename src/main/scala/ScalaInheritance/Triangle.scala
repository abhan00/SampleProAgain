package ScalaInheritance

class Triangle(var a: Int= 5, var b: Int = 3, var c: Int = 9) extends Polygon {
  override def area: Double = a * b * c;

}
