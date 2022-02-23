package com.coachhe.scala

import scala.collection.mutable
import scala.collection.immutable

object Lesson_Map {
  def main(args: Array[String]): Unit = {
    //可以是"a" -> 100，也可以是("c",300)
    val map = Map[String, Int]("a" -> 100, "b" -> 200, ("c",300))
    map.foreach(println)
    val result1: Option[Int] = map.get("a")
    val result2: Int = result1.get
    println(result2)
    println(result2)
    // getOrElse方法
    val result3: Any = map.get("aa").getOrElse("no value")
        // 另一种方法
    val result4: Any = map.getOrElse("aa", "no value")
    println(result3)
    println(result4)
    // 获取所有的key
    val keys: Iterable[String] = map.keys
    // 获取所有value
      // 原理是遍历所有key时去get对应map的value
    println("---遍历---")
    keys.foreach(key => {
      println(s"key = $key, value = ${map.get(key)}")
    })
    println("---遍历方法2---")
    val values: Iterable[Int] = map.values
    values.foreach(println)

    // Map之间的操作
    val map1 = Map[String, Int]("a" -> 1, "b" -> 200)
    val map2 = Map[String, Int]("a" -> 100, "c" -> 300 )
      //map的合并1
    val result5: Map[String, Int] = map1.++(map2)  //map1和map2合并，并且用map2中的值替换map1的值
      //map的合并2
      val result6: Map[String, Int] = map1.++:(map2)  //map1和map2合并，并且用map1中的值替换map2的值
    println("---map1.++map2---")
    result5.foreach(println)   //此时a的value为100
    println("---map1.++:map2---")
    result6.foreach(println)   //此时a的value为100

    //可变map
    val map3 = mutable.Map[String, Int]()
    map3.put("a",1)
    map3.put("b",2)
    map3.put("c",3)
    println("--打印map3--")
    map3.foreach(println)
    // filter方法
    println("--filter--")
    val result7: mutable.Map[String, Int] = map3.filter(tp => {
      val key = tp._1
      val value = tp._2
      value == 200
    })
    result7.foreach(println)


  }

}
