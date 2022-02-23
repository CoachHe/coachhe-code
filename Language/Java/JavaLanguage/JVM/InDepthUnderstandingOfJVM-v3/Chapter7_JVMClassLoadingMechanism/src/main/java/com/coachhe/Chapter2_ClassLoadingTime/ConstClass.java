package com.coachhe.Chapter2_ClassLoadingTime;

public class ConstClass {
    static {
        System.out.println("ConstClass init");
    }

    public static final String HELLOWORLD = "hello world";
}
