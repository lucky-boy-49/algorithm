package main.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 四数之和
 */
public class FourSum {

    public List<List<Integer>> solution(int[] nums, int target) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            long curTarget1 = target - nums[i];
            for (int j = i + 1; j < length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                long curTarget2 = curTarget1 - nums[j];
                int l = length - 1;
                for (int k = j + 1; k < length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    while (k < l && nums[k] + nums[l] > curTarget2) {
                        --l;
                    }
                    if (l == k) {
                        break;
                    }
                    if (nums[k] + nums[l] == curTarget2) {
                        LinkedList<Integer> list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }

}
