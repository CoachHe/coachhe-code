package com.coachhe.scala

object Lesson_Trait {
  // 相当于接口和抽象类的整合
  def main(args: Array[String]): Unit = {

    val human = new Human()
    human.read("Zhang San")

    val point1 = new Point(1, 2)
    val point2 = new Point(1, 3)
    println(point1.isEqu(point2))
  }

}

trait Read {
  // trait无法传参，也就是没有括号
  def read(name:String) = {
    println(s"$name is reading...")
  }
}

trait Listen {
  def listen(name:String) = {
    println(s"$name is listening...")
  }
}

class Human() extends Read with Listen {
  // 继承多个trait时第一个关键字用extends,后面全都是with

}

trait IsEqual{
  def isEqu(o:Any):Boolean
  def isNotEqu(o:Any):Boolean = {
    !isEqu(o)
  }
}

class Point(x:Int, y:Int) extends IsEqual {
  val xx = x
  val yy = y

  override def isEqu(o: Any): Boolean = {
    o.isInstanceOf[Point] && o.asInstanceOf[Point].xx == this.xx
  }
}