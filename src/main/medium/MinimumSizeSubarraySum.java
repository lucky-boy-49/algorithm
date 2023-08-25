package main.medium;

/**
 * 209. 长度最小的子数组
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1 && nums[0] >= target) {
            return 1;
        }
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = 1, curSum = nums[left], ans = Integer.MAX_VALUE;
        while (right < nums.length || curSum >= target) {
            if (curSum < target) {
                curSum += nums[right++];
            } else {
                ans = Math.min(ans, right - left);
                curSum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
