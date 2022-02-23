package 第2节_基本的线程机制.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex6_Mine implements Runnable {
    public static int i = 0;

    @Override
    public void run() {
        int t = (int) (Math.random() * 10000);
        try {
            System.out.println(t);
            Thread.sleep(t);
            System.out.println("task " + i + " will last " + (long)(t / 1000) + " seconds");
            i++;
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Ex6_Mine());
        }
        exec.shutdown();
    }

}
