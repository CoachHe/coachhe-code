package 第2节_类加载的时机.被动引用.调用类的常量;

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
