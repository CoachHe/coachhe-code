package 第2节_基本的线程机制.A1_定义任务;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new ListOff());
        }
        exec.shutdown();
    }
}
