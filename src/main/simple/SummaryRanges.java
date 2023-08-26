package main.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int left = 0, right = 1;
        String s;
        while (right < nums.length) {
            if (nums[right - 1] + 1 != nums[right]) {
                if (left == right - 1) {
                    s = String.valueOf(nums[left]);
                } else {
                    s = nums[left] + "->" + nums[right - 1];
                }
                result.add(s);
                left = right;
                right = left + 1;
            } else {
                right++;
            }
        }
        if (left == right - 1) {
            s = String.valueOf(nums[left]);
        } else {
            s = nums[left] + "->" + nums[right - 1];
        }
        result.add(s);
        return result;
    }

}
