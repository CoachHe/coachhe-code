package com.coachhe.scala


/**
 * Scala:
 * 1. Scala object相当于Java中的单例，object中定义的全是静态的
 * 2. Scala中定义变量使用var，定义常量使用val，变量可变常量不可变，变量和常量类型可以省略，会自动推断
 * 3. Scala中每行后面都会有分号自动推断机制，不用显式写出";"
 * 4. 建议在Scala中命名使用驼峰命名法
 * 5. Scala类中可以传参，传参一定要指定类型，有了参数就有了默认构造，但是object不能传参，若需要传参则需要定义apply方法
 * 6. 类中重写构造，构造第一行必须先调用默认的构造
 * 7. Scala中当new class时，类中除了方法不执行（除了构造方法），其他的都执行
 * 8. Object一定会被加载，而class只有new了之后才会被加载
 * 9. 在同一个文件中Object和class的名称可以一样，一样时class叫做object的伴生类，object叫做class的伴生对象，可以互相访问私有变量
 * 10.
 */

object Lesson_ClassAndObject {
  val price = 100
  println(price)

  //若需要传参则需要定义这个方法
  def apply(i:Int)={
    println("Score is" + i)
  }

  def main(args: Array[String]): Unit = {
    val name = "coachhe"
    println(name)
    val p = new Person("zhangsan", 20, 'F')
    println(p.age)
    println(p.name)
    println(p.gender)

  }

}

// Java的类没有括号，不能传参，Scala可以
// 传递的参数xname和sage是Person私有的东西，不可见
class Person(xname :String, xage :Int){
  val name = xname
  val age = xage
  var gender = 'M'

  def sayName()={
    println("Hello World_" + Lesson_ClassAndObject.price)
  }

  def this(yname :String, yage :Int, ygender: Char){
    this(yname, yage)
    this.gender = gender
  }

}

