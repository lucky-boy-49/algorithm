package difficulty;

import main.difficulty.WordLadder;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author HJ
 * @date 2023/9/12 10:50
 * @description
 */
class WordLadderTest {

    @Test
    void ladderLength() {
        String beginWord = "hot", endWord = "dog";
        List<String> wordList = List.of("hot", "cog", "dog", "tot", "hog", "hop", "pot", "dot");
        WordLadder wordLadder = new WordLadder();
        System.out.println(wordLadder.ladderLength(beginWord, endWord, wordList));
    }
}