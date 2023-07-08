package main.simple;

import java.util.Arrays;

/**
 * 寻找数组元素的中心下标
 */
public class FindCenterSubscriptArray {

    public int pivotIndex(int[] nums) {
        long sum = Arrays.stream(nums).sum();
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total == sum) {
                return i;
            } else {
                sum -= nums[i];
            }
        }
        return -1;
    }

}
