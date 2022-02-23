package 第2节_基本的线程机制.B2_Thread类;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

//:concurrency/MoreBasicThreads.java
//Adding more threads
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ListOff()).start();
        }
        System.out.println("Waiting for ListOff");
    }
}
