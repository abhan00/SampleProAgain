package Lazy

case class LazyEval() {
lazy val l = {
  println("lazy")
}
}
