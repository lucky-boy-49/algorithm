package simple;

/**
 * @author HJ
 * @version 1.0.0
 * @ClassName LargestSubarraySum.java
 * @Description 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 * 示例 1：
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 示例 2：
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 * @createTime 2023年03月14日 15:47:00
 */
public class LargestSubarraySum {
    /**
     * @title maxSubArray
     * @description
     * @author HJ
     * @updateTime 2023/3/14 下午3:48
     * @throws
     */
    public int maxSubArray(int[] nums) {
        // 第一种
//        int pre = 0;
//        int res = nums[0];
//        for (int num : nums) {
//            pre = Math.max(pre+num, num);
//            res = Math.max(res, pre);
//        }
//        return res;
        // 第二种
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1; i < len; i++) {
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        int res = dp[0];
        for(int i = 1; i < len; i++) {
          res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        LargestSubarraySum largestSubarraySum = new LargestSubarraySum();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestSubarraySum.maxSubArray(nums));
    }

}
