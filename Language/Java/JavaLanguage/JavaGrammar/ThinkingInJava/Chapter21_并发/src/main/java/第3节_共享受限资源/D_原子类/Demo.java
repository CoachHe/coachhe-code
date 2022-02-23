package 第3节_共享受限资源.D_原子类;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.compareAndSet(5, 1);
    }
}
