package 第2节_基本的线程机制.Test;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Ex5_Mine {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            results.add(exec.submit(new Fibonacci(i)));
        }
        for (Future<Integer> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}

class Fibonacci implements Callable<Integer> {

    private int n = 0;

    public Fibonacci(int n) {
        this.n = n;
    }

    private int fib(int x) {
        if (x < 2) {
            return 1;
        } else {
            return fib(x - 2) + fib(x - 1);
        }
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += fib(i);
        }
        return result;
    }
}