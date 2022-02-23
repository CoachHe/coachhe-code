package com.coachhe.annotation;

import java.util.List;

// 什么是注解
public class DeprecatedAndSuppressWarning {

    @Override
    public String toString() {
        return "Hello";
    }

    // Deprecated，不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    // SuppressWarning注解，可以忽视警告
    @SuppressWarnings("all")
    public void test02(){
        List list;
    }

    // main
    public static void main(String[] args) {
        test();
    }
}
