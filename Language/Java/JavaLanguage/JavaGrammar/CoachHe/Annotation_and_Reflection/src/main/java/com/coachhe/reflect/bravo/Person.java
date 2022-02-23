package com.coachhe.reflect.bravo;

import java.lang.reflect.Method;

public class Person {

    public Person() {
        System.out.println("I am initialized");
    }

    //    ClassLoader
    //    Class
    //    Method
    public void sayHi() {
        System.out.println("Hi");
    }
}
