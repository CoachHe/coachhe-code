package com.coachhe.annotation;

import java.lang.annotation.*;

// 测试元注解
@MyAnnotation //放这里可以
public class TargetRetentionDocumentedInherited {

//    @MyAnnotation // 这里会报错，因为在下面声明了只能修饰Element.TYPE，也就是类或者接口等
    public void test(){

    }
}

// 定义一个注解
// @Target 表示我们的注解可以用在哪些地方
@Target(value= ElementType.TYPE)
// @Retention 表示我们的注解在什么地方还有效，比如SOURCE只能在源码阶段有效
@Retention(value= RetentionPolicy.SOURCE)
// @Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented
// @Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{}
