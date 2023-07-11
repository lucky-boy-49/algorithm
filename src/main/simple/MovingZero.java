package main.simple;

import java.util.Arrays;

/**
 * @author HJ
 * 283. 移动零
 */
public class MovingZero {

    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[temp++] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args){
        MovingZero movingZero = new MovingZero();
        int[] nums = {0, 1, 0, 3, 12};
        movingZero.moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

}