package medium;

/**
 * @author HJ
 * @date 2023/4/26 17:05
 * @description 1031. 两个非重叠子数组的最大和
 */
public class MaximumSumOfTwoNonOverlappingSubarrays {

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(help(nums, firstLen, secondLen), help(nums, secondLen, firstLen));
    }

    public int help(int[] nums, int firstLen, int secondLen) {
        int suml = 0;
        for (int i = 0; i < firstLen; ++i) {
            suml += nums[i];
        }
        int maxSumL = suml;
        int sumr = 0;
        for (int i = firstLen; i < firstLen + secondLen; ++i) {
            sumr += nums[i];
        }
        int res = maxSumL + sumr;
        for (int i = firstLen + secondLen, j = firstLen; i < nums.length; ++i, ++j) {
            suml += nums[j] - nums[j - firstLen];
            maxSumL = Math.max(maxSumL, suml);
            sumr += nums[i] - nums[i - secondLen];
            res = Math.max(res, maxSumL + sumr);
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumSumOfTwoNonOverlappingSubarrays sum = new MaximumSumOfTwoNonOverlappingSubarrays();
        int[] nums = {0, 6, 5, 2, 2, 5, 1, 9, 4};
        int firstLen = 1, secondLen = 2;
        System.out.println(sum.maxSumTwoNoOverlap(nums, firstLen, secondLen));
    }

}
