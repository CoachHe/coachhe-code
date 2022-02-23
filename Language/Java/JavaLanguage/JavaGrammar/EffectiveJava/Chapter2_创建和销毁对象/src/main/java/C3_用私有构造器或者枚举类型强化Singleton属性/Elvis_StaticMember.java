package C3_用私有构造器或者枚举类型强化Singleton属性;

public class Elvis_StaticMember {
    public static final Elvis_StaticMember INSTANCE = new Elvis_StaticMember();

    private Elvis_StaticMember() {
        System.out.println("Static Member");
    }

    public void leaveTheBuilding() {
    }
}

class Call_StaticMember{
    public static void main(String[] args) {
        Elvis_StaticMember elvis = Elvis_StaticMember.INSTANCE;

    }
}
