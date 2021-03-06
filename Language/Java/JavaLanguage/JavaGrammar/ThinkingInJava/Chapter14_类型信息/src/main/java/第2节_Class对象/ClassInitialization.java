package 第2节_Class对象;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = 第2节_Class对象.Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinalf2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("第2节_Class对象.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinalf2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initialization Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
