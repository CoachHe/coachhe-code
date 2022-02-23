package com.coachhe.scala

import java.util.Date

object Lesson_MethodAndFunction {


  def main(args: Array[String]): Unit = {
    def max(x: Int, y: Int): Int = {
      if (x > y) {
        x
      } else {
        y
      }
    }

    val result: Int = max(100, 200)
    println(result)
    val result2 = max(100, 200)
    println(result2)

    /**
     * 2. 递归方法
     *
     * @param num : Int
     * @return Int
     */
    def fun(num: Int): Int = {
      if (num == 1) {
        1
      } else {
        num * fun(num - 1)
      }
    }

    println(fun(5))

    /**
     * 3. 参数有默认值的方法
     */
    def add(a: Int = 10, b: Int = 20): Int = {
      a + b
    }

    println(add())
    println(add(100, 200)) // 使用自己的逻辑
    println(add(100)) // 只给a赋值，不给b赋值
    println(add(b = 200)) // 只给b赋值，不给a赋值

    /**
     * 4. 可变长参数的方法
     */
    def my_print(s: String*) = {
      //循环方法1
      for (elem <- s) {
        println(elem)
      }
      //循环方法2：foreach  匿名函数形式
      s.foreach(elem => (println(elem)))
      //或者
      s.foreach(println)
    }

    my_print("Hello", "Java")


    /**
     * 5. 匿名函数（匿名方法）
     * =>就是匿名函数，多用于方法的参数是函数时，常用匿名函数
     */
    def mul = (a: Int, b: Int) => {
      a * b
    }

    println(mul(1, 2))

    /**
     * 6. 嵌套方法
     *
     */
    def fun1(num: Int): Unit = {
      def fun2(a: Int): Int = {
        if (a == 1) {
          1
        } else {
          a * fun2(a - 1)
        }
      }

      fun1(num)
    }

//    println(fun1(5))


    /**
     * 7. 偏应用函数
     */
    def showLog(date: Date, log: String) = {
      println(s"date is $date, log is $log")
    }

    val date = new Date()
    showLog(date, "a")
    showLog(date, "b")
    showLog(date, "c")

    def fun_showLog = showLog(date, _: String)

    fun_showLog("aaa")

    /**
     * 8. 高阶函数
     * 1） 方法的参数是函数
     * 2） 方法的返回是函数
     * 3） 方法的参数和返回都是函数
     */
      // 首先：方法的参数是函数
    def fun8_1(f: (Int, Int) => Int, s: String) = {
      val i = f(100, 200)
      i + "#" + s
    }

    println(fun8_1(add, "Scala"))

    val result3 = fun8_1((a:Int, b:Int) => (a*b), "Scala")
    println(result3)

    // 2. 方法的返回是函数,若是不加下划线则必须显式写出返回的函数名
    def fun8_2(s:String) : (String, String) => String ={
      def fun8_2_1(s1:String, s2:String): String ={
        s1 + "~" + s2 + "#" + s
      }
      fun8_2_1
    }
    def fun8_3(s:String) = {
      def fun8_3_1(s1:String, s2:String): String ={
        s1 + "~" + s2 + "#" + s
      }
      fun8_3_1 _  //在这里下划线表示强制返回，也就是返回值会设置成(String, String)=>String的函数
    }
    println(fun8_3("a")("b","c"))

    // 3. 方法的参数和返回都是函数
    def fun8_4(f: (String)=>String) : (String, String) => String ={
      def fun8_4_1(s1:String, s2:String) : String ={
        s1 + "#" + s2
      }
      val str8_4 = fun8_4_1("Hello", "scala") + f("Hi")
      println(str8_4)
      fun8_4_1
    }

    /**
     * 9. 柯里化函数(其实就是高阶函数）
     */
    def fun9(a:Int, b:Int)(c:Int, d:Int) = {
      a+b+c+d
    }
    println(fun9(1,2)(3,4))

  }


}
