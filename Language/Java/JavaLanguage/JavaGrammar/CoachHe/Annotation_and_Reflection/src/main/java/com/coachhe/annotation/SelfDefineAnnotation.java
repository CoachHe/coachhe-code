package com.coachhe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解
public class SelfDefineAnnotation {
    // 必须给name赋值
    @MyAnnotation2(name="coachhe",schools={"HIT"})
    public void test(){}

    // 这里name的有默认值，为空
    @MyAnnotation2(schools = {"HIT"})
    public void test2(){}

    @MyAnnotation3("hi")
    public void test3(){};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{

    // 注解的参数：参数类型+参数名();
    String name() default "";
    int id() default -1; // 如果默认值为-1，代表不存在

    String[] schools();

}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String value();
}