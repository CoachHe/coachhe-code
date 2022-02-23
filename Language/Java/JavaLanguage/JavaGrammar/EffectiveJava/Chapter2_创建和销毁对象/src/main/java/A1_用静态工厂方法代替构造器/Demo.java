package A1_用静态工厂方法代替构造器;

public class Demo {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        Object student1 = Student.newInstance();
        Object student2 = Student.newInstance();
        System.out.println(student2 == student1);
        Object student3 = new Student();
        Object student4 = new Student();
        System.out.println(student3.equals(student4));
        System.out.println(Boolean.valueOf("true"));
//        Student student5 = new Student();
//        Student student6 = (StudentLeader) Student.newInstance();
//        System.out.println(student5.equals(student6));
    }
}
