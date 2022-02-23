package 第7节_Java标准异常;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clz = Class.forName("src/第7节_Java标准异常/hello.class");
    }
}
