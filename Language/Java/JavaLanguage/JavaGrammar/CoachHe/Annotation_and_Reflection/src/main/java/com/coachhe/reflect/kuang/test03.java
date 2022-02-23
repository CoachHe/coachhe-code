package com.coachhe.reflect.kuang;

// 测试class类的创建方式有哪些
public class test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        // 1. 通过对象获得
        Class<?> c1 = person.getClass();

        // 2. forname获得
        Class<?> c2 = Class.forName("com.coachhe.reflect.kuang.Student");

        // 3. 通过类型.class获得
        Class<Student> c3 = Student.class;

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}