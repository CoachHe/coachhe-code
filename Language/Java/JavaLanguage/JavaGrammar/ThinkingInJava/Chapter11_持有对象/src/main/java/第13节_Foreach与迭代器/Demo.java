package 第13节_Foreach与迭代器;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>(Arrays.asList("Hello Java 1".split(" ")));
        Collection<String> cs2 = new LinkedList<>(Arrays.asList("Hello Java 2".split(" ")));

        cs.addAll(cs2);
        System.out.println(cs);
        String[] strings = new String[]{"Hello", "Java", "3"};
        Collections.addAll(cs, strings);
        System.out.println(cs);
    }
}
