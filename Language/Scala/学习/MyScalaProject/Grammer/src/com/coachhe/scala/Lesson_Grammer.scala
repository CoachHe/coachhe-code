package com.coachhe.scala

object Lesson_Grammer {
  def main(args: Array[String]): Unit = {

    /**
     * if else
     */
    val age = 20;
    if(age < 20) {
      println("age < 20")
    } else if (age == 20 ){
      println("age = 20")
    } else {
      println("age > 20")
    }

    /**
     * for循环
     * 注意：在这里
     * 1 to 10 就是Range(1,2,3,4,5,6,7,8,9,10)
     * 1 until 10 就是Range(1,2,3,4,5,6,7,8,9)
     * 1 to (10,2) 就是Range(1,3,5,7,9)
     */
    for (i <- 1 to 10) {
      print(i + " ")
    }
    println()
    for (i <- 1 to (10,2)) {
      print(i + " ")
    }
    println()
    for (i <- 1 to 3; j <- 1 to 3) {
      //在字符串之前加上s可以不用进行拼接
      println(s"i =  $i  j = $j")
    }

    /**
     * while语法
     * 和java完全相同
     */
    var i = 0;
    while (i < 3) {
      println(s"hello $i")
      i += 1
    }


  }

}
