package E5_优先考虑依赖注入来引用资源;

import java.util.List;

//Inappropriate use of singleton - inflexible & untestable!
public class SpellChecker_SingletonMethod {
    private final Lexicon dictionary = Lexicon.getInstance();

//    private SpellChecker_SingletonMethod(){}
//    public static INSTANCE = new SpellChecker_SingletonMethod();

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}
