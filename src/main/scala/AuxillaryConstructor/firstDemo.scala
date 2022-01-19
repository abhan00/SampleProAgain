package AuxillaryConstructor
/*             getter         setter
    var         yes             yes
    val         yes             no
    default      no             no
* */
class User(private var name : String,val age: Int){

    //inside a class we create a methode call this
    def this(){
      this("tom", 32)
    }
    //0r
    def this (name: String){
      this(name, 32)
    }


}

object firstDemo {

  def main(args: Array[String]): Unit ={

    var user1 = new User("Max", 28)
    var user2 = new User()
    var user3 = new User("Ram")
    println(user1)
    println(user2)
    println(user3)
  }

}
