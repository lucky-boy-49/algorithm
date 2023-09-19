package main.medium;

import java.util.Arrays;

/**
 * @author HJ
 * @date 2023/9/19 21:36
 * @description 2560. 打家劫舍 IV
 */
public class HouseRobberIV {

    public int minCapability(int[] nums, int k) {
        if (nums.length == 0) {
            return -1;
        }
        int lower = Arrays.stream(nums).min().getAsInt();
        int upper = Arrays.stream(nums).max().getAsInt();
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            int count = 0;
            boolean visited = false;
            for (int x : nums) {
                if (x <= middle && !visited) {
                    count++;
                    visited = true;
                } else {
                    visited = false;
                }
            }
            if (count >= k) {
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }
        return lower;
    }

}
