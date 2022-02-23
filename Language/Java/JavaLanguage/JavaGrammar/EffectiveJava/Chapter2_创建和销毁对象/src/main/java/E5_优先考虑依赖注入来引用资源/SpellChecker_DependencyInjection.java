package E5_优先考虑依赖注入来引用资源;

import java.util.List;

public class SpellChecker_DependencyInjection {
    private final Lexicon dictionary;

    public SpellChecker_DependencyInjection(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}
