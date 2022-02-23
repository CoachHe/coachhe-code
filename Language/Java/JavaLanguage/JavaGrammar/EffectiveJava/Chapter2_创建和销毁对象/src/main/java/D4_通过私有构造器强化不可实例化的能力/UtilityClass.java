package D4_通过私有构造器强化不可实例化的能力;

//Noninstantiable utility class
public class UtilityClass {
    //Suppress default constructor for noninstantiability
    private UtilityClass(){
        throw new AssertionError();
    }
}
