package main.medium;

public class SortArray {

    /**
     * 冒泡排序
     *
     * @param nums
     * @return
     */
    public int[] solution1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        return nums;
    }

    public int[] solution2(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            int num = nums[i];
            for (int j = i; j >= 0; j--) {
                if (nums[j] > num) {
                    nums[j + 1] = nums[j];
                } else {
                    nums[j] = num;
                    break;
                }
            }
        }
        return nums;
    }

    public int[] solution3(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int curMinIndex = 0, curMinValue = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {
                if (nums[j] < curMinValue) {
                    curMinValue = nums[j];
                    curMinIndex = j;
                }
            }
            int tmp = nums[curMinIndex];
            nums[curMinIndex] = nums[i];
            nums[i] = tmp;
        }
        return nums;
    }

    public int[] solution4(int[] nums) {
        quicK(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicK(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int cur = nums[start], index1 = start, index2 = end;
        boolean flag = true;
        while (index1 < index2) {
            if (flag) {
                if (nums[index2] <= cur) {
                    nums[index1] = nums[index2];
                    flag = false;
                    index1++;
                } else {
                    index2--;
                }
            } else {
                if (nums[index1] >= cur) {
                    nums[index2] = nums[index1];
                    flag = true;
                    index2--;
                } else {
                    index1++;
                }
            }
        }
        nums[index1] = cur;
        quicK(nums, start, index2 - 1);
        quicK(nums, index1 + 1, end);
    }

}
