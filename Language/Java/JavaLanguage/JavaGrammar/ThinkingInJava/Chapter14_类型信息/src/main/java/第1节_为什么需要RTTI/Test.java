package 第1节_为什么需要RTTI;

public class Test {
    public static void main(String[] args) {
        Man man = new Student();
        System.out.println(man.draw());
        Man man2 = new Man() {
            @Override
            public String toString() {
                return "man";
            }
        };
        System.out.println(man2.draw());
        System.out.println(man.getClass());

    }
}

abstract class Man{
    public String draw() {
        return this + ".draw()";
    }
    public abstract String toString();
}

class Student extends Man {
    @Override
    public String toString() {
        return "Student";
    }
}
