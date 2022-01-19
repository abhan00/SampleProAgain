package firstProjectDemo

object Firstdemo {
  def main(args: Array[String]) {
    val name = "Mark"
    val age = 18.5
    println("The name of the person is " + name + " and he is " + age + " years old")
    println(s"$name is $age year's old")
    println(f"$name%s is $age%f year's old")
    println(raw"hello \n world")
    println(s"hello \n world")
  }
}
