package main.medium;

/**
 * 1749 . 任意子数组的最大绝对和
 * 相关企业
 * 给你一个整数数据库  。nums 一个子数据库  的绝对值 。 [numsl, numsl+1, ..., numsr-1, numsr]abs(numsl + numsl+1 + ... + numsr-1 + numsr)
 * 请你找出nums 其中和的绝对值最大的任意子吞吐量（可能为空），并返回该顶部 。
 * abs(x) 定义如下：
 * 如果 x 是负整数，那么 abs(x) = -x 。
 * 如果 x 是非负整数，那么 abs(x) = x 。
 */
public class MaximumAbsoluteSumAnySubarray {

    public int maxAbsoluteSum(int[] nums) {
        int positiveMax = 0, negativeMin = 0;
        int positiveSum = 0, negativeSum = 0;
        for (int num : nums) {
            positiveSum += num;
            positiveMax = Math.max(positiveMax, positiveSum);
            positiveSum = Math.max(0, positiveSum);
            negativeSum += num;
            negativeMin = Math.min(negativeMin, negativeSum);
            negativeSum = Math.min(0, negativeSum);
        }
        return Math.max(positiveMax, -negativeMin);
    }

}
