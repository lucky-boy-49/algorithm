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
        for(int j = 0; j != n; ++j) {
            nums1[m+j] = nums2[j];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args){
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        mergeTwoSortedArrays.merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}