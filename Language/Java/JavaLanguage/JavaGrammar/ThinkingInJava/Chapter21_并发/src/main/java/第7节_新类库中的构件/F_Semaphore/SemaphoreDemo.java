package 第7节_新类库中的构件.F_Semaphore;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {

    private static Semaphore s = new Semaphore(2);

    static class ParkTask implements Runnable {
        private String name;

        public ParkTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                s.acquire();
                System.out.println("Thread " + this.name + " start...");
                TimeUnit.SECONDS.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s.release();
            }
        }

        public static void main(String[] args) {
            ExecutorService pool = Executors.newCachedThreadPool();
            pool.submit(new ParkTask("1"));
            pool.submit(new ParkTask("2"));
            pool.submit(new ParkTask("3"));
            pool.submit(new ParkTask("4"));
            pool.submit(new ParkTask("5"));
            pool.submit(new ParkTask("6"));
            pool.shutdown();
        }
    }
}