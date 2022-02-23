package com.coachhe.scala

object Lesson_ImplicitTrans {

  // 隐式函数
  def sayName(implicit name:String) = {
    println(s"name is $name")
  }
  // 隐式函数（当部分参数隐式时）
  def sayName2(age:Int)(implicit name:String) = {
    println(s"name is $name, age is $age")
  }

  def main(args: Array[String]): Unit = {
    // 隐式值
    implicit val name:String = "zhangsan"
    // 在这里，sayName会自动寻找最近的一个隐式值进行匹配
    sayName
    sayName2(50)

  }
}
