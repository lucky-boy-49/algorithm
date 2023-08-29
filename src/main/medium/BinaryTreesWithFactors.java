package main.medium;

import java.util.Arrays;

/**
 * 823. 带因子的二叉树
 */
public class BinaryTreesWithFactors {

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        long[] dp = new long[len];
        long mod = 1000000007, res = 0;
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int left = 0, right = i - 1; left <= right; left++) {
                while (left <= right && (long) arr[left] * arr[right] > arr[i]) right--;
                if (right >= left && (long) arr[left] * arr[right] == arr[i]) {
                    if (right != left) {
                        dp[i] = (dp[i] + dp[left] * dp[right] * 2) % mod;
                    } else {
                        dp[i] = (dp[i] + dp[left] * dp[right]) % mod;
                    }
                }
            }
            res = (res + dp[i]) % mod;
        }
        return (int) res;
    }

}
