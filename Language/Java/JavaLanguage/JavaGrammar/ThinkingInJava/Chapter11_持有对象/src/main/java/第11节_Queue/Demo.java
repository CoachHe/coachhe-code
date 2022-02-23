package 第11节_Queue;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueDemo = new PriorityQueue();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,2,4,1));
        System.out.println(list);
        priorityQueueDemo.addAll(list);
        System.out.println(priorityQueueDemo);
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }
        System.out.println();
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> integerIterator1 = queue.iterator();
        while (integerIterator1.hasNext()) {
            System.out.print(integerIterator1.next() + " ");
        }
        System.out.println();
        for (int tmp : queue) {
            System.out.print(tmp + " ");
        }
    }
}
