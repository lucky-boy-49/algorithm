package simple;

import main.simple.LongestContinuousIncreasingSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestContinuousIncreasingSubsequenceTest {

    @Test
    void findLengthOfLCIS() {
        LongestContinuousIncreasingSubsequence subsequence = new LongestContinuousIncreasingSubsequence();
        int[] nums = new int[] {1,3,5,4,2,3,4,5};
        int lengthOfLCIS = subsequence.findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}