package com.coachhe.scala

class Animal(name:String){
  def canFly()={
    println(s"$name can fly")
  }
}

class Rabbit(xname:String){
  val name = xname
}

object Lesson_ImplicitTrans2 {

  // 隐式转换
  implicit def RabbitToAnimal(r:Rabbit): Animal = {
    // 分析：传进来一个Rabbit出去一个Animal
    new Animal(r.name)
  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit("rabbit")
    //此时就能调用rabbit没有的canFly方法了
    rabbit.canFly()

  }

}
