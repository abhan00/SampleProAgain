package MatchCondition

object DemoMatch {
  def main(args: Array[String]): Unit ={
    val age = "18";
    age match {
      case "20" =>println(age)
      case "22" =>println(age)
      case "28" =>println(age)
      case "25" =>println(age)
      case "39" =>println(age)
      case "18" =>println(age)
      case "23" =>println(age)
      case _ =>println("default")
    }
    val result= age match {
      case "20" =>age
      case "22" =>age
      case "28" =>age
      case "25" =>age
      case "39" =>age
      case "18" =>age
      case "23" =>age
      case _ =>"Wrong age please try again"
    }
    println("Result is: "+ result)

    val num = 3;
    num match{
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }

  }

}
