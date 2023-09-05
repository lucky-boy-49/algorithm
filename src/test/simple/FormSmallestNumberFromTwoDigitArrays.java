package test.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2605. 从两个数字数组里生成最小数字
 */
public class FormSmallestNumberFromTwoDigitArrays {
	
	public int minNumber(int[] nums1, int[] nums2) {
		int res = Integer.MAX_VALUE;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}
		for (int num : nums2) {
			if (set.contains(num)) {
				res = Math.min(res, num);
			}
		}
		int i1 = nums1[0];
		int i2 = nums2[0];
		if (i1 < i2) {
			return Math.min(res, i1 * 10 + i2);
		} else {
			return Math.min(res, i2 * 10 + i1);
		}
	}
	
}