package 第1节_基本语法;

public class Demo {
    public static void main(String[] args) {
        String a = "abcd";
        String b = new String("abcd");
        String c = "abcd";
        String d = new String("abcd");
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(b == d);
        System.out.println(a == c);
    }

}