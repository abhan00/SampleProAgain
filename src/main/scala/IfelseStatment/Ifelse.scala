package IfelseStatment

object Ifelse {
  def main(array: Array[String]): Unit ={
    var a= 5
    var res = ""
    if(a <= 6){
      res ="true"
    }else{
      res = "false"
    }
    println(res)
    println(if(a==5)true else false)

    val y =30
    val x= 20
    var res1=""
    println(if(x==30 && y ==20)true else false)

    if((x+y)>=60){
      res1 = "Yes it's conditionally true "
    }else if((x+y)== 40){
      res1 = "It may  be or may not be true use calculator"
    }else {
      res1="condition is false"
    }
    println(res1)

  }

}
