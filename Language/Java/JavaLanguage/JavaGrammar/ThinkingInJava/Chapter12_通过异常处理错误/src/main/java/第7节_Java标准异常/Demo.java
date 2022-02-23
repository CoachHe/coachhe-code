package 第7节_Java标准异常;

import com.sun.xml.internal.ws.api.model.CheckedException;

public class Demo {

    public static void test(){
        int[] arr = new int[1];
        System.out.println(arr[2]);
    }
    public static void test2(int i){
        if (i == 1) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args){
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("error");
        }
        try {
            test();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound");
        }
        try {
            test2(1);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
//        CheckedException
        System.out.println();
    }
}
