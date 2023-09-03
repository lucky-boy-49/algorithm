package main.medium;

import java.util.Arrays;

/**
 * @author HJ
 * @date 2023/9/3 08:52
 * @description 1921. 消灭怪物的最大数量
 */
public class EliminateMaximumNumberMonsters {

    public int eliminateMaximum(int[] dist, int[] speed) {
        int len = dist.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = dist[i] / speed[i] + (dist[i] % speed[i] == 0 ? 0 : 1);
        }
        Arrays.sort(arr);
        for (int i = 1; i < len; i++) {
            if (arr[i] <= i) {
                return i;
            }
        }
        return len;
    }

}
