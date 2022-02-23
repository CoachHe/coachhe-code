package 第3节_共享受限资源.A_不正确地访问资源;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    //Allow this to be canceled:
    public void cancel(){
        canceled = true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
