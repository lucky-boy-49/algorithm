package main.simple;

import java.util.Arrays;

/**
 * @author HJ
 * 977. 有序数组的平方
 */
public class SquareOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args){
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        Arrays.stream(squareOfSortedArray.sortedSquares(nums)).forEach(System.out::println);
    }

}