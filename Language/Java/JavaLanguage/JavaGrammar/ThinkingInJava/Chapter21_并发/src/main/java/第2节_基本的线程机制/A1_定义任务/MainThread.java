package 第2节_基本的线程机制.A1_定义任务;

//:concurrency/MainThread.java
public class MainThread {
    public static void main(String[] args) {
        ListOff launch = new ListOff();
        launch.run();
    }
}
