package 第1节_基本语法.A_定义注解;


import java.lang.annotation.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    public String sayhi() default "Hello Java";
}
