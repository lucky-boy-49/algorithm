package medium;

import main.medium.ReverseWords;
import org.junit.jupiter.api.Test;

class ReverseWordsTest {

    @Test
    void reverseWords() {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("  hello world  "));
    }
}