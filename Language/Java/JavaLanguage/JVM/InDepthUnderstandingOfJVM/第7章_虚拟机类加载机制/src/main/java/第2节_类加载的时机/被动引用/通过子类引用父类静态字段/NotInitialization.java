package 第2节_类加载的时机.被动引用.通过子类引用父类静态字段;

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
