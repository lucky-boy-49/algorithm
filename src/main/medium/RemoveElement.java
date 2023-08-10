package main.medium;

/**
 * 27. 移除元素
 */
public class RemoveElement {

    public int solution(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }
        return curIndex;
    }

}
