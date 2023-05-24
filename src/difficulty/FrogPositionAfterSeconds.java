package difficulty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/5/24 21:50
 * @description 1377. T 秒后青蛙的位置
 */
public class FrogPositionAfterSeconds {

    public double frogPosition(int n, int[][] edges, int t, int target) {
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; ++i) {
            g[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        boolean[] seen = new boolean[n + 1];
        return dfs(g, seen, 1, t, target);
    }

    private double dfs(List<Integer>[] g, boolean[] seen, int i, int t, int target) {
        int nxt = i == 1 ? g[i].size() : g[i].size() - 1;
        if (t == 0 || nxt == 0) {
            return i == target ? 1.0 : 0.0;
        }
        seen[i] = true;
        double ans = 0.0;
        for (int j : g[i]) {
            if (!seen[j]) {
                ans += dfs(g, seen, j, t - 1, target);
            }
        }
        return ans / nxt;
    }

    public static void main(String[] args) {
        int n = 8, t = 7, target = 7;
        int[][] edges = {  {2, 1}, {3, 2}, {4, 1}, {5, 1}, {6, 4}, {8, 7} };
        FrogPositionAfterSeconds seconds = new FrogPositionAfterSeconds();
        System.out.println(seconds.frogPosition(n, edges, t, target));
    }

}
