package 第1节_泛型和类型安全的容器;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        Compile error
//        apples.add(new Orange());
        for (Object apple : apples) {
            System.out.println(((Apple) apple).id());
        }
    }
}
