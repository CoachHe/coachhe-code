package com.coachhe.reflect.kuang;

// 什么是反射
public class test02 {
    public test02() {
        System.out.println("I am test02 being initialized");
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 通过反射获取类的Class对象
        Class<?> c1 = Class.forName("com.coachhe.reflect.kuang.User");
        System.out.println(c1);
        User user = (User) c1.newInstance();
        Class<?> c2 = test02.class;
        test02 tt = (test02) c2.newInstance();
    }
}

// 实体类：pojo、entity
class User {
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}