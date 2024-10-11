package main.difficulty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 贺佳
 */
public class S149 {
    public int maxPoints(int[][] points) {
        Map<String, Integer> resMap = new HashMap<>();
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[i][1] - points[j][1];
                int dy = points[i][0] - points[j][0];
                if (dx == 0 && dy == 0) {
                    resMap.compute("slope", (k, v) -> (v == null) ? 1 : v + 1);
                    continue;
                }
                int g = gcd(dy, dx);
                if (g != 0) {
                    dy /= g;
                    dx /= g;
                }
                resMap.compute(dy + "/" + dx, (k, v) -> (v == null) ? 1 : v + 1);
            }
            int newRes = resMap.values().stream().max(Integer::compareTo).orElse(0);
            res = Math.max(res, newRes);
            resMap.clear();
        }
        return res + 1;
    }

    private int gcd(int dy, int dx) {
        if (dx == 0) {
            return dy;
        }
        return gcd(dx, dy % dx);
    }
}
