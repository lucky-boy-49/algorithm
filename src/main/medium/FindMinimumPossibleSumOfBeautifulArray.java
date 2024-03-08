package main.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2834. 找出美丽数组的最小和
 */
public class FindMinimumPossibleSumOfBeautifulArray {

    public int minimumPossibleSum(int n, int target) {
        int[] beautifulArray = new int[n];
        beautifulArray[0] = 1;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(target - 1, target - 1);
        int j = 2;
        for (int i = 1; i < n; ) {
            if (!map.containsKey(j)) {
                beautifulArray[i++] = j;
                if (j < target) {
                    map.put(target - j, target - 1);
                }

            }
            j++;
        }

        return Arrays.stream(beautifulArray).sum();
    }

    /**
     * 官方
     *
     * @param n      n
     * @param target target
     * @return 结果
     */
    public int minimumPossibleSum2(int n, int target) {
        final int MOD = (int) 1e9 + 7;
        int m = target / 2;
        if (n <= m) {
            return (int) ((long) (1 + n) * n / 2 % MOD);
        }
        return (int) (((long) (1 + m) * m / 2 +
                ((long) target + target + (n - m) - 1) * (n - m) / 2) % MOD);
    }

}
