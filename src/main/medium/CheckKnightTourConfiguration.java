package main.medium;

/**
 * @author HJ
 * @date 2023/9/13 21:23
 * @description 2596. 检查骑士巡视方案
 */
public class CheckKnightTourConfiguration {

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }
        int n = grid.length, num = n * n - 1, cur = 0;
        int[][] list = new int[][] {{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, -1}, {2, 1},
                {-1, -2}, {1, -2}};
        int i = 0, j = 0;
        while (cur < num) {
            int i1 = 0;
            for (; i1 < list.length; i1++) {
                int[] ints = list[i1];
                int newI = i + ints[0];
                int newJ = j + ints[1];
                if (newI > -1 && newI < n && newJ > -1 && newJ < n && grid[newI][newJ] == cur + 1) {
                    cur++;
                    i = newI;
                    j = newJ;
                    break;
                }
            }
            if (i1 == list.length) {
                break;
            }
        }
        return cur == num;
    }

}
