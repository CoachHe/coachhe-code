package 第2节_基本的线程机制.B2_Thread类;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

//:concurrency/BasicThreads.java
//The most basic use of the Thread class
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new ListOff());
        t.start();
        System.out.println("Waiting for ListOff" + " ");
    }
}
