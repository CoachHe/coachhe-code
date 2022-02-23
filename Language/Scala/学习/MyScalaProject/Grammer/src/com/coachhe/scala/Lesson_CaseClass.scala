package com.coachhe.scala

object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1 = new Persion11("zhangsan", 10)
    val p2 = new Persion11("zhangsan", 10)
    println(p1.equals(p2))
    println(p1.hashCode())
    println(p1.toString)
  }
}

// 用case修饰的就是样例类
case class Persion11(var name:String, age:Int){

}
