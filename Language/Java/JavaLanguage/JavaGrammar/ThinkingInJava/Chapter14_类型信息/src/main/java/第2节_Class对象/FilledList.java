package 第2节_Class对象;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
    public void print(){
        System.out.println("hahaha");
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(fl.create(15));
        CountedInteger.class.newInstance().print();
        CountedInteger c = new CountedInteger();
        System.out.println(c.getClass());
        System.out.println(CountedInteger.class.newInstance().getClass());
        Object s= String.class.newInstance();
        System.out.println(s.getClass());
        System.out.println(s);
    }
}
