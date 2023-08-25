package test.difficulty;

import main.difficulty.SubstringConcatenationAllWords;
import org.junit.jupiter.api.Test;

class SubstringConcatenationAllWordsTest {

    @Test
    void findSubstring() {
        SubstringConcatenationAllWords sca = new SubstringConcatenationAllWords();
        System.out.println(sca.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
    }
}