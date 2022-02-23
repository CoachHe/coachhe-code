package 第2节_基本的线程机制.C3_Executor;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new ListOff());
        }
        exec.shutdown();
    }
}
