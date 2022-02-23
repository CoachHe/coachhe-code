package 第3节_共享受限资源.C_原子性与易变性;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class volatileTest {
    static volatile boolean y = true;
//    static boolean y = true;
    //以上两种情况输出是不同的，若是volatile那个，最后会输出end然后结束，若没有volatile则不会输出end并且
    //进入死循环
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Runnable() {
            @Override
            public void run() {
                while (y) {
                }
                System.out.println("end");
            }
        });
        exec.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("Sleep over");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                y = false;
                System.out.println(y);
            }
        });
        exec.shutdown();
    }
}


