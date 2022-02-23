package 第2节_基本的线程机制.Test;

public class Ex1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SubEx1());
        Thread t2 = new Thread(new SubEx2());
        Thread t3 = new Thread(new SubEx3());
        t1.start();
        t2.start();
        t3.start();
    }
}

class SubEx1 implements Runnable{
    public SubEx1(){
        System.out.println("Ex1 action");

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("This is from Ex1 " + i++);
            Thread.yield();
        }
        System.out.println("Ex1 over");
    }
}

class SubEx2 implements Runnable{
    public SubEx2(){
        System.out.println("Ex2 action");

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("This is from Ex2 " + i++);
            Thread.yield();
        }
        System.out.println("Ex2 over");
    }
}

class SubEx3 implements Runnable{
    public SubEx3(){
        System.out.println("Ex3 action");

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("This is from Ex3 " + i++);
            Thread.yield();
        }
        System.out.println("Ex3 over");
    }
}
