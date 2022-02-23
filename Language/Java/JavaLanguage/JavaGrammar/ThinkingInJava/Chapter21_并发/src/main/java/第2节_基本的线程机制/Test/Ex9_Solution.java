package 第2节_基本的线程机制.Test;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import static java.lang.Thread.*;

class SimplePriorities9ThreadFactory implements ThreadFactory {
    Random rand = new Random();
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        int i = rand.nextInt(3);
        switch(i) {
            case 0 : t.setPriority(MIN_PRIORITY); break;
            case 1 : t.setPriority(NORM_PRIORITY); break;
            case 2 : t.setPriority(MAX_PRIORITY); break;
            default:
        }
        return t;
    }
}

public class Ex9_Solution implements Runnable {
    private int countDown = 5;
    private volatile double d; // No optimization
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }
    public void run() {
        while(true) {
            // An expensive, interruptable operation:
            for(int i = 0; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if(--countDown == 0) return;
        }
    }
    public static void main(String[] args) throws Exception {
        ExecutorService exec =
                Executors.newCachedThreadPool(new SimplePriorities9ThreadFactory());
        for(int i = 0; i < 5; i++)
            exec.execute(new Ex9_Solution());
        exec.execute(new Ex9_Solution());
        exec.shutdown();

    }
}
