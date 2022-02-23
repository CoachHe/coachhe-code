package 第2节_基本的线程机制.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex3_Mine {
    public static void main(String[] args) {
//        ExecutorService exec = Executors.newFixedThreadPool(5);
//        ExecutorService exec = Executors.newCachedThreadPool();
        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            exec.execute(new Ex());
        }
        exec.shutdown();
    }
}


class Ex implements Runnable {
    public static int id = 0;

    public Ex() {
        System.out.println("Ex action");
        id++;
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("This is from Ex " + i++);
            Thread.yield();
        }
        System.out.println("Ex over");
    }
}