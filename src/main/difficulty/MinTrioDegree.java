package main.difficulty;

/**
 * 1761. 一个图中连通三元组的最小度数
 */
public class MinTrioDegree {

    public int minTrioDegree(int n, int[][] edges) {
        int[][] g = new int[n][n];
        int[] degree = new int[n];

        // 遍历数组
        for (int[] edge : edges) {
            // 记录节点的边和节点的度
            int x = edge[0] - 1, y = edge[1] - 1;
            g[x][y] = g[y][x] = 1;
            ++degree[x];
            ++degree[y];
        }

        // 判断是否为三元组并计算度
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (g[i][j] == 1) {
                    for (int k = j + 1; k < n; ++k) {
                        if (g[i][k] == 1 && g[j][k] == 1) {
                            ans = Math.min(ans, degree[i] + degree[j] + degree[k] - 6);
                        }
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

}
