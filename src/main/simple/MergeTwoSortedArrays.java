package main.simple;

import java.util.Arrays;

/**
 * @author HJ
 * @version 1.0.0
 * @createTime 2023年03月15日
 * 88. 合并两个有序数组
 */
public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 第一种
        int[] tmp = nums1.clone();
        int index1 = 0, index2 = 0, i = 0;
        while (index1 < m && index2 < n) {
            if (tmp[index1] <= nums2[index2]) {
                nums1[i++] = tmp[index1++];
            } else {
                nums1[i++] = nums2[index2++];
            }
        }
        if (index1 == m) {
            while (index2 < n) {
                nums1[i++] = nums2[index2++];
            }
        } else {
            while (index1 < m) {
                nums1[i++] = tmp[index1++];
            }
        }

        // 第二种
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int curt = nums1.length - 1;
        while (n > 0) {
            nums1[curt--] = (m > 0 && nums1[m - 1] > nums2[n - 1]) ? nums1[--m] : nums2[--n];
        }
    }
    public static void main(String[] args){
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] nums1 = {0}, nums2 = {1};
        int m = 0, n = 1;
        mergeTwoSortedArrays.merge2(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}