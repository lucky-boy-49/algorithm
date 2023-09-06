package main.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * @author HJ
 * @date 2023/9/6 10:32
 * @description 130. 被围绕的区域
 */
public class SurroundedRegions {

    boolean[][] visited;

    List<int[]> list;

    public void solve(char[][] board) {
        int len = board.length, len2 = board[0].length;
        visited = new boolean[len][len2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    list = new LinkedList<>();
                    boolean dfs = dfs(board, i, j);
                    if (!dfs) {
                        list.forEach(a -> {
                            board[a[0]][a[1]] = 'X';
                        });
                    }
                }
            }
        }
    }

    private boolean dfs(char[][] grid, int i, int j) {
        visited[i][j] = true;
        list.add(new int[] {i, j});
        boolean left = false, right = false,  up = false, down = false;
        if (i - 1 > -1 && !visited[i - 1][j] && grid[i - 1][j] == 'O') {
            up = dfs(grid, i - 1, j);
        }
        if (i + 1 < grid.length && !visited[i + 1][j] && grid[i + 1][j] == 'O') {
            down = dfs(grid, i + 1, j);
        }
        if (j - 1 > -1 && !visited[i][j - 1] && grid[i][j - 1] == 'O') {
            left = dfs(grid, i,  j - 1);
        }
        if (j + 1 < grid[i].length && !visited[i][j + 1] && grid[i][j + 1] == 'O') {
            right = dfs(grid, i,  j + 1);
        }
        if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1) {
            return true;
        } else {
            return up || down || left || right;
        }
    }

}
