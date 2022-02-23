package 第10节_通配符;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<? extends Number> list1 = list;
        System.out.println(list1);
    }
}
