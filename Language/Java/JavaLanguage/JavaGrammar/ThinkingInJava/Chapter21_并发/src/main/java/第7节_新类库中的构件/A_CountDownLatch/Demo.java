package 第7节_新类库中的构件.A_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);
        latch.countDown();
        latch.countDown();
        System.out.println(latch.getCount());

    }
}
