package test.simple;

import main.simple.WordPattern;
import org.junit.jupiter.api.Test;

class WordPatternTest {

    @Test
    void wordPattern() {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }
}