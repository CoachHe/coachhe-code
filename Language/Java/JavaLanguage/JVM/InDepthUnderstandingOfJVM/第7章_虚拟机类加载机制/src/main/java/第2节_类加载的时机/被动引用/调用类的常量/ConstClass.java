package 第2节_类加载的时机.被动引用.调用类的常量;

public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}
