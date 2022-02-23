package C3_用私有构造器或者枚举类型强化Singleton属性;

public class Elvis_StaticFactory {
    private static final Elvis_StaticFactory INSTANCE = new Elvis_StaticFactory();

    private Elvis_StaticFactory() {
        System.out.println("Station Factory");
    }

    public static Elvis_StaticFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }
}

class Call_StaticFactory{
    public static void main(String[] args) {
        Elvis_StaticFactory elvis_staticFactory = Elvis_StaticFactory.getInstance();
    }
}

