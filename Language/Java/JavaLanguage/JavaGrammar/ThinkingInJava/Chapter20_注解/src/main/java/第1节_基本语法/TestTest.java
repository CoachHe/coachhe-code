package 第1节_基本语法;

import 第1节_基本语法.A_定义注解.Test;

import java.lang.reflect.Method;

public class TestTest {
    @Test
    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = Test.class;
        Method method = cls.getMethod("sayhi");
        Test test = method.getAnnotation(Test.class);
    }
}
