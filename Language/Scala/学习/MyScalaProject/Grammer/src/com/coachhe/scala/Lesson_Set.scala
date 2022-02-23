package com.coachhe.scala

import scala.collection.immutable
import scala.collection.mutable

object Lesson_Set {
  def main(args: Array[String]): Unit = {
    val set = Set[Int](1, 2, 3, 4, 4, 5)
    println("----")
    set.foreach(println)

    val set1 = Set[Int](3, 4, 5, 6)
    val result: Set[Int] = set1.intersect(set)  // 合并
    val result2: Set[Int] = set1.diff(set)      // 检查set1和set的不同之处(相当于是set1去掉set)
    val result3 = set1 & set1                   // 交集
    println("----")
    result.foreach(println)
    println("----")
    result2.foreach(println)
    println("----")
    result3.foreach(println)
    // 此外，filter等方法和List一样使用

    //可变的Set
    val set2 = mutable.Set[Int](1, 2, 3)
    val result4: set2.type = set2.+=(100)     //此时返回的是新的集合
    println("----")
    set2.foreach(println)
    set2.+=(100)                              //此时是往set2里新增元素
    println("----")
    result4.foreach(println)
    //重新定义一个不可变的Set
    val set3 = immutable.Set[String]("a","b","c")

  }
}
