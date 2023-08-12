package test.difficulty;

import main.difficulty.FindMedianSortedArrays;
import org.junit.jupiter.api.Test;

class FindMedianSortedArraysTest {

    @Test
    void solution() {
        int[] nums1 = {
                1, 2
        };
        int[] nums2 = {
                3, 4
        };
        System.out.println(new FindMedianSortedArrays().solution(nums1, nums2));
    }
}