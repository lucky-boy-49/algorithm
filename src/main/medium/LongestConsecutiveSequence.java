package main.medium;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int[] a = Arrays.stream(nums).sorted().distinct().toArray();
        int cur = 0;
        int left = 0, right = 1;
        while (right <= a.length) {
            if (right == a.length || a[right] != a[right - 1] + 1) {
                cur = Math.max(right - left, cur);
                left = right;
            }
            right++;
        }
        return cur;
    }

}
