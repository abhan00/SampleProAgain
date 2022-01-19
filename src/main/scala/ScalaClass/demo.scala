package ScalaClass
// when you create a private class make sure you have your variable inside your class
//public class
//var means we can change value
//val means we cannot change the value. like final in java
class newUser(var name : String, var age: Int);
//private or protected class
class User(protected var name : String, var age: Int){
  def printName: Unit ={
    println(name)
  }
}
object demo {
  def main(args:Array[String]): Unit ={
    var user = new User("Max", 25)
    var user1 = new newUser("Anjani", 30)
    println(user1.name)
    println(user1.age)

    user.printName
    println(user.age)

  }

}
