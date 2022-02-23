package 第6节_迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            Integer tmp = integerIterator.next();
            System.out.println(tmp);
        }
    }
}

class Pet{
//    public static List<Pet> iterator(int i) {
//
//    }
}
