package 第2节_基本的线程机制.N14_捕获异常;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExceptionTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new MyHandler());
        exec.execute(new Thread1());        
    }
}

class MyHandler implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setUncaughtExceptionHandler(new UnCaughtExceptionHandelr1());
        return t;
    }
}

class UnCaughtExceptionHandelr1 implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread1 is running");
        throw new RuntimeException();
    }
}