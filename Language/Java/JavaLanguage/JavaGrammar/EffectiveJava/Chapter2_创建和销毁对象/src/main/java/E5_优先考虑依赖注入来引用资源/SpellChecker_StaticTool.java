package E5_优先考虑依赖注入来引用资源;

import java.util.List;

public class SpellChecker_StaticTool {
    private static final Lexicon dictionary = Lexicon.getInstance();

    private SpellChecker_StaticTool(){} //Noninstantiable

    public static boolean isValid(String word) {
        return true;
    }

    public static List<String> suggestions(String typo) {
        return null;
    }
}

class Lexicon{
    private Lexicon(){}

    private static final Lexicon INSTANCE = new Lexicon();

    public static Lexicon getInstance() {
        return INSTANCE;
    }
}
