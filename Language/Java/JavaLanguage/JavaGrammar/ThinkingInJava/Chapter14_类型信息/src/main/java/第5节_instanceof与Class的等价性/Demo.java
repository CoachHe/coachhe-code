package 第5节_instanceof与Class的等价性;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Child.class);
        Child child = new Child();
        Parent parent = new Parent();
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Child);
        System.out.println(Child.class.isInstance(parent));
        System.out.println(Parent.class.isInstance(child));
    }
}
class Child extends Parent{}
class Parent{}
