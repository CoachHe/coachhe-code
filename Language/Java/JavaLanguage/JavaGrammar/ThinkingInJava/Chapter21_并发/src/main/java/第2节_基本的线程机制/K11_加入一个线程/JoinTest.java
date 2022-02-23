package 第2节_基本的线程机制.K11_加入一个线程;

public class JoinTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("thread1", 1000);
        Thread2 thread2 = new Thread2("thread2", thread1);
//        thread2.interrupt();
    }
}

class Thread1 extends Thread{
    private int time;
    private String name;

    public Thread1(String name, int time) {
        this.name = name;
        this.time = time;
        start();
    }

    public void run(){
        try {
            System.out.println("start sleeping");
            sleep(time);
            System.out.println("sleeping over");
        } catch (InterruptedException e) {
            System.out.println("The thread " + getName() + " is interrupted");
        }
    }
}

class Thread2 extends Thread{
    private String name;
    private Thread1 thread1;

    public Thread2(String name, Thread1 thread1) {
        this.thread1 = thread1;
        this.name = name;
        start();
    }

    public void run(){
        try {
            thread1.join();
            System.out.println("join complete");
        } catch (InterruptedException e) {
            System.out.println(getName() + " is in.");
        }
    }
}
