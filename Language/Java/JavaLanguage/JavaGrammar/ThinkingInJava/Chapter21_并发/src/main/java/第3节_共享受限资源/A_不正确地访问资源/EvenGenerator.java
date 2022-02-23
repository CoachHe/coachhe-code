package 第3节_共享受限资源.A_不正确地访问资源;

public class EvenGenerator extends IntGenerator{
    private int currentEvenValue = 0;
    public int next(){
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
