package 第3节_共享受限资源.B_解决共享资源竞争;

import 第3节_共享受限资源.A_不正确地访问资源.EvenChecker;
import 第3节_共享受限资源.A_不正确地访问资源.IntGenerator;

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
