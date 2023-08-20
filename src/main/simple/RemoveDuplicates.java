package main.simple;

/**
 * 26. 删除有序数组中的重复项
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }

}
