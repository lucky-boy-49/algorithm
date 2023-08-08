package test.medium;

import main.medium.MaximumAbsoluteSumAnySubarray;
import org.junit.jupiter.api.Test;

class MaximumAbsoluteSumAnySubarrayTest {

    @Test
    void maxAbsoluteSum() {
        int[] nums = new int[]{1, -3, 2, 3, -4};
        int i = new MaximumAbsoluteSumAnySubarray().maxAbsoluteSum(nums);
        System.out.println(i);
    }
}