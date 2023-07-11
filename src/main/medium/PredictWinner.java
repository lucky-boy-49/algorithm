package main.medium;

/**
 * 486. Predict the Winner
 */
public class PredictWinner {

    public boolean PredictTheWinner(int[] nums) {

        return maxScore(nums, 0, nums.length - 1, 1) >= 0;

    }

    public int maxScore(int[] nums, int left, int right, int turn) {

        if (left == right) {
            return nums[left] * turn;
        }

        int scoreStart = nums[left] * turn + maxScore(nums, left + 1, right, -turn);
        int scoreEnd = nums[right] * turn + maxScore(nums, left, right - 1, -turn);
        return Math.max(scoreStart * turn, scoreEnd * turn) * turn;

        
    }



}
