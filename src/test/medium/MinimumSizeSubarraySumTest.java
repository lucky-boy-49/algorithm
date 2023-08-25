package test.medium;

import main.medium.MinimumSizeSubarraySum;
import org.junit.jupiter.api.Test;

class MinimumSizeSubarraySumTest {

    @Test
    void minSubArrayLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        MinimumSizeSubarraySum msss = new MinimumSizeSubarraySum();
        System.out.println(msss.minSubArrayLen(target, nums));
    }
}