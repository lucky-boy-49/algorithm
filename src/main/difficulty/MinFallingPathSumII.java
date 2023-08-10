package main.difficulty;

/**
 * 1289. 下降路径最小和 II
 */
public class MinFallingPathSumII {

    public int solution(int[][] grid) {
        int len = grid.length;
        int[][] dp = new int[len][len];
        System.arraycopy(grid[0], 0, dp[0], 0, len);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < len; k++) {
                    if (k != j) {
                        min = Math.min(dp[i - 1][k], min);
                    }
                }
                dp[i][j] = min + grid[i][j];
            }

        }
        int res = dp[len - 1][0];
        for (int i = 1; i < len; i++) {
            res = Math.min(res, dp[len - 1][i]);
        }
        return res;
    }

    public int solution2(int[][] grid) {
        int n = grid.length;
        int first_min_sum = 0;
        int second_min_sum = 0;
        int first_min_index = -1;

        for (int i = 0; i < n; i++) {
            int cur_first_min_sum = Integer.MAX_VALUE;
            int cur_second_min_sum = Integer.MAX_VALUE;
            int cur_first_min_index = -1;

            for (int j = 0; j < n; j++) {
                int cur_sum = (j != first_min_index ? first_min_sum : second_min_sum) + grid[i][j];
                if (cur_sum < cur_first_min_sum) {
                    cur_second_min_sum = cur_first_min_sum;
                    cur_first_min_sum = cur_sum;
                    cur_first_min_index = j;
                } else if (cur_sum < cur_second_min_sum) {
                    cur_second_min_sum = cur_sum;
                }
            }
            first_min_sum = cur_first_min_sum;
            second_min_sum = cur_second_min_sum;
            first_min_index = cur_first_min_index;
        }
        return first_min_sum;
    }

}
