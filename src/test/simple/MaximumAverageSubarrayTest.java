package test.simple;

import main.simple.MaximumAverageSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayTest {

    @Test
    void findMaxAverage() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();
        double maxAverage = maximumAverageSubarray.findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }
}