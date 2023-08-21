package main.medium;

/**
 * 45. 跳跃游戏 II
 */
public class JumpGameII {

    public int jump(int[] nums) {
        int ans = 0, start = 0, end = 1;
        while (end < nums.length) {
            int maxPos = 0;
            for (int i = start; i < end; i++) {
                maxPos = Math.max(maxPos, i + nums[i]);
            }
            start = end;
            end = maxPos + 1;
            ans++;
        }
        return ans;
    }

}
