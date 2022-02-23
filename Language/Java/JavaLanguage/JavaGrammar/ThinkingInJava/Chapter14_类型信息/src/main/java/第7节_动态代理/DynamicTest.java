package 第7节_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args) {
        man proxy = (man) Proxy.newProxyInstance(man.class.getClassLoader(), new Class[]{man.class},
                new me(new Student()));
        proxy.print();
    }
}

interface man{
    void print();
}

class Student implements man{

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}

class me implements InvocationHandler {
    private Object proxied;

    public me(Object proxied) {
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I am a proxy");
        return method.invoke(proxied, args);
    }
}