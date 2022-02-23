package java.com.coachhe.JVM.Chapter3_垃圾收集器与内存分配策略;

public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1023;

    /**
     * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        //假设在这行发生GC, objA和objB是否能被回收？
        System.gc();   //只是建议
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        testGC();
        String s = "abc";
    }
}
