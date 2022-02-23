package 第3节_共享受限资源.A_不正确地访问资源;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    private EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }
    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel(); //Cancels all EvenCheckers
            }
        }
    }

    //Test any type of IntGenerator:
    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }

    //Default value for count
    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
