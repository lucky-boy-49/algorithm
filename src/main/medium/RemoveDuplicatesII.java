package main.medium;

/**
 * 80. 删除有序数组中的重复项 II
 */
public class RemoveDuplicatesII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int left = 0, right = 1, curSum = 1;
        while (right < nums.length) {
            if (nums[right] == nums[left] && curSum != 2) {
                nums[++left] = nums[right];
                curSum = 2;
            } else if (nums[right] != nums[left]) {
                nums[++left] = nums[right];
                curSum = 1;
            }
            right++;
        }
        return left + 1;
    }

}
