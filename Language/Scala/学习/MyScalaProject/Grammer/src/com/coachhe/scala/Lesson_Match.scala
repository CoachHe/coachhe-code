package com.coachhe.scala

/**
 * Match 模式匹配
 * 1. case _ 表示默认匹配，放在最后一个
 * 2. match 可以匹配值还可以匹配类型
 * 3. 从上往下匹配，匹配上之后就不会往下匹配了
 * 4. 匹配过程中会有数值的转换，例如Double转换为Int
 * 5. 模式匹配中外部的"{}"可以省略
 *
 * PartitionFunction 偏函数
 * 只能匹配一个值，匹配上了返回某个值
 * PartitionFunction[A,B]，A是匹配的类型，B是匹配上返回的类型
 */

object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tp = (1,1.0,"abc",'a', true)
    val iterator: Iterator[Any] = tp.productIterator
    iterator.foreach(MathTest)

    val result: Int = PartialFunctionTest("abc")
    println(result)
  }


  def MathTest(o:Any): Unit = {
    o match {
      case i:Int=>println(s"type is Int, value = $i") //类型匹配，查看是否符合Int类型
      case d:Double=>println(s"type is Double, value = $d") //类型匹配，查看是否符合Double类型
      case s:String=>println(s"type is String, value = $s") //类型匹配，查看是否符合String类型
      case 1=> println("value is 1") //值匹配,查看值是否为1
      case 'a'=> println("value is a")
      case _=> println("no match") //相当于default，必须放在最后一个
    }
  }

  def PartialFunctionTest : PartialFunction[String, Int] = {  //进来只能是String，出去是Int
    case "abc" => 2
    case "a" => 1
    case "100" => 200
    case _=> 0
  }

}
