package 第2节_基本的线程机制.Test;

/** Following the form of generics/Fibonacci.java, create a task that produces
 * a sequence of n Fibonacci numbers, where n is provided to the constructor
 * of the task. Create a number of these tasks and drive them using threads.
 **/
class Ex2FibonacciA implements Runnable {
    private int n = 0;
    public Ex2FibonacciA(int n) {
        this.n = n;
    }
    private int fib(int x) {
        if(x < 2) return 1;
        return fib(x - 2) + fib(x - 1);
    }
    public void run() {
        for(int i = 0; i < n; i++)
            Method.print(fib(i) + " ");
        Method.println();
    }

}

class Ex2FibonacciB implements Runnable {
    private int n = 0;
    public Ex2FibonacciB(int n) {
        this.n = n;
    }
    private int fib(int x) {
        if(x < 2) return 1;
        return fib(x - 2) + fib(x - 1);
    }
    public void run() {
        for(int i = 0; i < n; i++)
            Method.print(fib(i) + " ");
        Method.println();
    }
}

class Ex2FibonacciC implements Runnable {
    private int n = 0;
    public Ex2FibonacciC(int n) {
        this.n = n;
    }
    private int fib(int x) {
        if(x < 2) return 1;
        return fib(x - 2) + fib(x - 1);
    }
    public void run() {
        for(int i = 0; i < n; i++)
            Method.print(fib(i) + " ");
        Method.println();
    }
}

class Ex2FibonacciD implements Runnable {
    private int n = 0;
    public Ex2FibonacciD(int n) {
        this.n = n;
    }
    private int fib(int x) {
        if(x < 2) return 1;
        return fib(x - 2) + fib(x - 1);
    }
    public void run() {
        for(int i = 0; i < n; i++)
            Method.print(fib(i) + " ");
        Method.println();
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Thread f1 = new Thread(new Ex2FibonacciA(15));
        Thread f2 = new Thread(new Ex2FibonacciB(15));
        Thread f3 = new Thread(new Ex2FibonacciC(15));
        Thread f4 = new Thread(new Ex2FibonacciD(15));
        f1.start();
        f2.start();
        f3.start();
        f4.start();
    }
}

class Method{
    public static void println() {
        System.out.println();
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
