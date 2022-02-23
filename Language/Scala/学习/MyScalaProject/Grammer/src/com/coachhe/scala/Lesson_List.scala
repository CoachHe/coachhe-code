package com.coachhe.scala

import scala.collection.mutable.ListBuffer

object Lesson_List {
  /**
   * List
   */
  def main(args: Array[String]): Unit = {
    val list = List[Int](1,2,3)
    //遍历的两种方法
    list.foreach(println)
    for (elem <- list) {
      println(elem)
    }
    val list2 = List[String]("hello scala", "hello java")
    //map和flatmap
    val result: List[Array[String]] = list2.map(s => {
      s.split(" ")
    })
    result.foreach(arr => {
      arr.foreach(println)
    })
    val result2: List[String] = list2.flatMap(s => {
      s.split(" ")
    })
    result2.foreach(println)
    //filter 过滤掉不符合条件的内容
    val result3: List[String] = list2.filter(s => "hello scala".equals(s))
    result3.foreach(println)
    //count 计算符合条件的数量
    val result4: Int = list2.count(s => {
      s.length < 4
    })
    println(result4)

    //可变的list
    val list3 = ListBuffer[Int](1, 2, 3)
    list3.append(4,5,6)
    list3.+=:(100)
    list3.foreach(println)


  }

}
