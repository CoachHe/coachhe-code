package 第2节_填充容器;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

//        Collections.fill(queue, new Integer("5"));
//        List
        //        Collections.fill(queue, new Integer("4")
        List<Integer> collection = new ArrayList<>(Collections.nCopies(4, 5));
        System.out.println(collection);
        Collections.fill(collection, 8);
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        Collections.addAll(collection1, collection);
        System.out.println(collection1);
    }
}
