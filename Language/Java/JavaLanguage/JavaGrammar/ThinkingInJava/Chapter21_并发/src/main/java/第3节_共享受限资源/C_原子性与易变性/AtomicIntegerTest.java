package 第3节_共享受限资源.C_原子性与易变性;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class IncreaseThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            AtomicIntegerTest.value.incrementAndGet();
        }
    }
}

public class AtomicIntegerTest {

    public static AtomicInteger value = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
    	ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new IncreaseThread());
		exec.execute(new IncreaseThread());
		exec.shutdown();
		Thread.sleep(5000);//等待两个线程执行结束
		System.out.println("Value = " + value);
	}
}