package test.medium;

import main.medium.LongestConsecutiveSequence;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        System.out.println(l.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}