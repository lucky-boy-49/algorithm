package main.medium;

/**
 * @author HJ
 * @date 2023/9/6 10:04
 * @description 200. 岛屿数量
 */
public class NumberIslands {

    boolean[][] visited;

    public int numIslands(char[][] grid) {
        int len = grid.length, len2 = grid[0].length, res = 0;
        visited = new boolean[len][len2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j) {
        visited[i][j] = true;
        if (i - 1 > -1 && !visited[i - 1][j] && grid[i - 1][j] == '1') {
            dfs(grid, i - 1, j);
        }
        if (i + 1 < grid.length && !visited[i + 1][j] && grid[i + 1][j] == '1') {
            dfs(grid, i + 1, j);
        }
        if (j - 1 > -1 && !visited[i][j - 1] && grid[i][j - 1] == '1') {
            dfs(grid, i,  j - 1);
        }
        if (j + 1 < grid[i].length && !visited[i][j + 1] && grid[i][j + 1] == '1') {
            dfs(grid, i,  j + 1);
        }
    }

}
