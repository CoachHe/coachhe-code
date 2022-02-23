package 第2节_基本的线程机制.Test;

import 第2节_基本的线程机制.A1_定义任务.ListOff;

public class Ex8_Solution {
    public static void main(String[] args) {
        try { // increase number of threads to see effect
            for(int i = 0; i < 25; i++) {
                Thread t = new Thread(new ListOff());
                t.setDaemon(true);
                t.start();
            }
            System.out.println("Waiting for LiftOff");
        } finally {
            System.out.println("Finally out of main");
        }
    }
}
