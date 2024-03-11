package difficulty;

import main.difficulty.WordSearchIITwo;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordSearchIITwoTest {

    @Test
    void findWords() {
        WordSearchIITwo wordSearchII = new WordSearchIITwo();
        List<String> words = wordSearchII.findWords(new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}}, new String[]{"oath", "pea", "eat", "rain"});
        words.forEach(System.out::print);
    }
}