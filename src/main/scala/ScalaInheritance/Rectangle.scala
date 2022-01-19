package ScalaInheritance

class Rectangle(var width : Double, var height: Double) extends Polygon {
  override def area : Double = width * height

def perimeter(x:Int= 5, y :Int=6): Int = x*y;
  println(perimeter());


}
