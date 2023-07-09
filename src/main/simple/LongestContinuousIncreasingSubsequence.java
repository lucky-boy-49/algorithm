package main.simple;

public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        int left = 0, right = 1, maxLength = 0, curtLength = 1;
        while (right < nums.length) {
            if (nums[left] < nums[right]) {
                curtLength++;
            } else {
                maxLength = Math.max(maxLength, curtLength);
                curtLength = 1;
            }
            left++;
            right++;
        }
        return Math.max(curtLength, maxLength);
    }

}
