package main.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 870. 优势洗牌
 */
public class AdvantageShuffle {

    public int[] advantageCount(int[] nums1, int[] nums2) {

        int n = nums1.length;
        Integer[] idx2 = new Integer[n];
        for (int i = 0; i < n; ++i) {
            idx2[i] = i;
        }
        Arrays.sort(nums1);
        Arrays.sort(idx2, Comparator.comparingInt(i -> nums2[i]));
        int left = 0, right = n - 1;
        for (int i : nums1) {
            if (i > nums2[idx2[left]]) {
                nums2[idx2[left++]] = i;
            } else {
                nums2[idx2[right--]] = i;
            }
        }

        return nums2;

    }

}
