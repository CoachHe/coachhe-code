package 第1节_不可变String;

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "ho wdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
        q.toUpperCase();
        q.split(" ");
        System.out.println(q);
    }
}
