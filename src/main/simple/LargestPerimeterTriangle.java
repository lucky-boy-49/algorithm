package main.simple;

import java.util.Arrays;

/**
 * 976. Largest Perimeter Triangle
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int curt = 2, maxLength = 0;

        while (curt < nums.length) {
            boolean triangle = isTriangle(nums[curt - 2], nums[curt - 1], nums[curt]);
            if (triangle) {
                maxLength = Math.max(maxLength, nums[curt - 2] + nums[curt - 1] + nums[curt]);
            }
            curt++;
        }
        return maxLength;

    }

    public boolean isTriangle(int num1, int num2, int num3) {
        if (Math.abs(num1 - num2) > num3 || Math.abs(num1 - num3) > num2 || Math.abs(num3 - num2) > num1) {
            return false;
        }
        return num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2;
    }

    public int largestPerimeter2(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }

}
