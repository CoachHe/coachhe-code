package 第2节_基本的线程机制.Test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex6_Solution implements Runnable {
    Random rand = new Random();
    public void run() {
        try {
            int t = 1000 * rand.nextInt(10);
            TimeUnit.MILLISECONDS.sleep(t);
            System.out.println("Slept " + t/1000 + " seconds");
            return;
        } catch(InterruptedException e) {
            System.err.println("Interrupted");
        }

    }
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: enter a number");
        }
        if(args.length == 1) {
            int n = Integer.parseInt(args[0]);
            ExecutorService exec = Executors.newCachedThreadPool();
            for(int i = 0; i < n; i++)
                exec.execute(new Ex6_Solution());
            exec.shutdown();
        }
    }
}
