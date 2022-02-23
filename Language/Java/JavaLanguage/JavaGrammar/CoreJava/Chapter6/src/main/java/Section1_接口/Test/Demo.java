package Section1_接口.Test;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("I love JY 1314");
        int i = 20;
        String name = "Harry";
        Demo d = new Demo();
        if (name == null) {
            System.out.println("1");
        }
        if (name != null) {
            System.out.println("2");
        }
        if (name != null) {
            System.out.println("3");
        }
        List<String> list = Arrays.asList("a", "b", "c");
        for (String s : list) {
            System.out.println(s);
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.println(i1);
        }
        boolean a = true;
        if (!a == true) {
            System.out.println("4");
        }
        if (a == true) {
            System.out.println("5");
        }
    }
}
