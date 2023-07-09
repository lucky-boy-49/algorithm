package main.simple;

/**
 * 643 . 最大平均子阵 I
 */
public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right = k - 1;
        double current = 0;
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }
        double maxAverage = current;
        while (right + 1 < nums.length) {

            current = current - nums[left++] + nums[++right];

            maxAverage = Math.max(current, maxAverage);

        }

        return maxAverage / k;

    }

}
