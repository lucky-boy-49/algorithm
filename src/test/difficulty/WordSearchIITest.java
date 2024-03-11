package test.difficulty;

import main.difficulty.WordSearchII;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordSearchIITest {

    @Test
    void findWords() {
        WordSearchII wordSearchII = new WordSearchII();
        List<String> words = wordSearchII.findWords(new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"});
        words.forEach(System.out::print);
    }
}