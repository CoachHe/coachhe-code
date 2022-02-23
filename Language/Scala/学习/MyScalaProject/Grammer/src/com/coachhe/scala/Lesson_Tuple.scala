package com.coachhe.scala

object Lesson_Tuple {
  def main(args: Array[String]): Unit = {
    // 一堆元素放在一个括号里就是元祖
    // 和列表很像，只是放入了不同类型的元素
    val tuple1: Tuple1[String] = new Tuple1("Hello")
    val tuple2: (String, Int) = new Tuple2("a", 100)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1, true, 'C')
      //也可以不用new
    val tuple4: (Int, Double, String, Boolean) = Tuple4(1, 3.4, "abc", false)
      //甚至可以不用Tuple
    val tuple5: (Int, Int, Int, Int, Int) = (1, 2, 3, 4, 5)
      //Tuple最多可以写到22个，23个时已经不是元祖了
    val tuple22: (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    //数量为23时不能识别元素类型了，运行时会报错
    //val tuple23 = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23)

    // 取元素
    println(tuple1._1)
    println(tuple2._2)
    println(tuple22._21)
    //遍历,元祖没有for和foreach
    println("--循环遍历1--")
    val iterator: Iterator[Any] = tuple5.productIterator
    iterator.foreach(println)
    println("--循环遍历2--")
    val iterator2: Iterator[Any] = tuple5.productIterator
    while (iterator2.hasNext) {
      println(iterator2.next())
    }


  }

}
