package 第2节_基本的线程机制.A1_定义任务;

//: concurrency/ListOff.java
// Demonstration of the Runnable interface.

public class ListOff implements Runnable {
    public int countDown = 5;//Default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public ListOff(){}

    public ListOff(int countDown) {
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Listoff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
} ///:~
