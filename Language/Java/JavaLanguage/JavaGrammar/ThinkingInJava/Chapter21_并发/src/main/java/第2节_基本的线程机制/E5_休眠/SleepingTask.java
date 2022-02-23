package 第2节_基本的线程机制.E5_休眠;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends ListOff {
    public void run(){
        while (countDown-- > 0) {
            try {
                System.out.println(status());
                //Old-style
                //Thread.sleep(100);
                //Java SE5/6-style
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
