package 第3节_共享受限资源.D_原子类;

import 第3节_共享受限资源.A_不正确地访问资源.EvenChecker;
import 第3节_共享受限资源.A_不正确地访问资源.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);

    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
