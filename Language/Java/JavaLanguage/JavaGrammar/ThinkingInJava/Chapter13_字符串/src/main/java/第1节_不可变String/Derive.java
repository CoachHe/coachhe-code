package 第1节_不可变String;

public class Derive extends Base
{
    private Member m1 = new Member("Member 1");
    {
        System.out.println("Initial Block()");
        String s = "abc";
        
    }

    public Derive() {
        System.out.println("Derive()");
    }

    private Member m2 = new Member("Member 2");
    private int i = getInt();

    private int getInt()
    {
        System.out.println("getInt()");
        return 2;
    }

    public static void main(String[] args)
    {
//        new Derive();
    }
}

class Base
{
    public Base()
    {
        System.out.println("Base()");
    }
    static {
        System.out.println("Hello Java");
    }
}

class Member
{
    public Member(String m)
    {
        System.out.println("Member() "+m);
    }

    static {
        System.out.println("Hello Java");
    }
}