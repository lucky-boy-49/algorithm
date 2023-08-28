package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 452. 用最少数量的箭引爆气球
 */
public class MinimumNumberArrowsBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        int[][] array = Arrays.stream(points)
                .sorted(Comparator.comparingInt(a -> a[0]))
                .toArray(int[][]::new);
        List<int[]> list = new ArrayList<>();
        int[] cur = array[0];
        for (int i = 1; i <= array.length; i++) {
            if (i != array.length) {
                int[] point = array[i];
                if (cur[1] >= point[0]) {
                    cur[0] = Math.max(cur[0], point[0]);
                    cur[1] = Math.min(cur[1], point[1]);
                } else {
                    list.add(cur);
                    cur = point;
                }
            } else {
                list.add(cur);
            }
        }
        return list.size();
    }

    public int findMinArrowShotsII(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int pos = points[0][1];
        int ans = 1;
        for (int[] point : points) {
            if (point[0] > pos) {
                pos = point[1];
                ans++;
            }
        }
        return ans;
    }

}
