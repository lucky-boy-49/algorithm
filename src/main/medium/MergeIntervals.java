package main.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 56. 合并区间
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> result = new LinkedList<>();
        int[][] array = Arrays.stream(intervals)
                .sorted(Comparator.comparingInt(a -> a[0]))
                .toArray(int[][]::new);
        int[] cur = array[0];
        int[] a;
        for (int i = 1; i < array.length; i++) {
            a = array[i];
            if (cur[1] >= a[0]) {
                cur[0] = Math.min(cur[0], a[0]);
                cur[1] = Math.max(cur[1], a[1]);
            } else {
                result.add(cur);
                cur = a;
            }
        }
        result.add(cur);
        return result.toArray(int[][]::new);
    }

}
