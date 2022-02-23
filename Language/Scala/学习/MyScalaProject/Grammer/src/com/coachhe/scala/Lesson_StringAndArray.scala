package com.coachhe.scala

object Lesson_StringAndArray {
  def main(args: Array[String]): Unit = {
    /**
     * 字符串
     * 采用的就是java.lang.String
     * 用法和java基本相同
     */
    val s = "Hello"
    val s1 = "hello"

    println(s)
    println(s1)
    println(s.equals(s1))
    println(s.equalsIgnoreCase(s1))
    println(s.indexOf('H'))

    /**
     * 集合
     */
      //定义方法1
    val arr = Array[String]("a","b","c","d");
    //遍历方法1
    arr.foreach(println)
    //遍历方法2
    for(elem <- arr) {
      println(elem)
    }
    //定义方法2  默认的定义方式都是不可变的
    val arr1 = new Array[Int](3)
    //赋值方法
    arr1(0) = 1
    arr1(1) = 1
    arr1(2) = 2
    // 定义2维数组
    val arr2 = new Array[Array[Int]](2)
    arr2(0) = Array[Int](1,2,3)
    arr2(1) = Array[Int](4,5,6)
    //打印2维数组
    for (arr <- arr2) {
      for (elem <- arr) {
        println(elem)
      }
    }
    //第2种方式打印2维数组
    for (arr <- arr2; elem <- arr) {
      println(elem)
    }
    //第3种方式打印2维数组
    arr2.foreach(arr=>{arr.foreach(println)})

    //数组的合并
    //val arrays = Array.concat(arr1, arr2)
    //arrays.foreach(println)

    Array.fill(5)("Hello")

    //可变数组
    import scala.collection.mutable.ArrayBuffer
    val arr_mut = ArrayBuffer[Int](1,2,3)
    arr_mut.+=(4) //往后追加
    arr_mut.+=:(100)  //往前追加
    arr_mut.append(7,8,9) //往后追加

  }

}
