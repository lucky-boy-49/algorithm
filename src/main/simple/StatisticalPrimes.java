package main.simple;

import java.util.HashMap;

/**
 * 统计素数
 */
public class StatisticalPrimes {

    /**
     * 暴力算法
     * @param n 统计范围
     * @return 统计结果
     */
    public int violence(int n) {
        int result = 0;

        for (int i = 2; i < n; i++) {
            int tmp = 0;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    tmp = 1;
                    break;
                }
            }
            if (tmp == 0) {
                result++;
            }
        }

        return result;

    }

    /**
     * 埃氏筛选：排除2*n。。。。
     * @param n 统计范围
     * @return 统计结果
     */
    public int eratosthenes(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int result = 0;

        for (int i = 2; i < n; i++) {
            if (!map.containsKey(i)) {
                result++;
                for (int j = i * i; j < n; j += i) {
                    map.put(j, true);
                }
            }
        }

        return result;

    }

}
