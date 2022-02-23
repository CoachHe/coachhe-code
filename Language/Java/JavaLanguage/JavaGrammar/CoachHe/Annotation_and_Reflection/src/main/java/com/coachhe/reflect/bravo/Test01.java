package com.coachhe.reflect.bravo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test01 {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
        Class clz = Class.forName("com.coachhe.reflect.bravo.Person");
//        Person per = (Person) clz.newInstance();
//        per.sayHi();
        Constructor constructor = clz.getDeclaredConstructor();
        Method method = clz.getMethod("sayHi");
        System.out.println(method.getName());
        method.invoke(clz.newInstance());
    }
}
