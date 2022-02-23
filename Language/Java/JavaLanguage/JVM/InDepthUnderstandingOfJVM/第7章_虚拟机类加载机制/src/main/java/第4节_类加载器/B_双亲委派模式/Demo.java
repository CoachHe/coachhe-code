package 第4节_类加载器.B_双亲委派模式;

public class Demo {
    ClassLoader classLoader = new ClassLoader() {
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return super.loadClass(name);
        }
    };
}
