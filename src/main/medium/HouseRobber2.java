package main.medium;

/**
 * House Robber II
 */
public class HouseRobber2 {

    public int rob(int[] nums) {
        return Math.max(maxMoney(nums, 0, nums.length - 1), maxMoney(nums, 1, nums.length));
    }

    public int maxMoney(int[] nums, int start, int end) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++) {
            int tmp = second;
            second = Math.max(second, first + nums[i]);
            first = tmp;
        }
        return second;
    }

}
