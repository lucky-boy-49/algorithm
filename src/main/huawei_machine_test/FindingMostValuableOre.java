package main.huawei_machine_test;

/**
 * 寻找最大价值的矿堆
 */
public class FindingMostValuableOre {

    public static void solution(int[][] board) {
        int l = board.length;
        int w = board[0].length;
        boolean[][] booleans = new boolean[l][w];
        int res = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if (!booleans[i][j]) {
                    if (board[i][j] == 2 || board[i][j] == 1) {
                        int curV = check(booleans, i, j, board);
                        res = Math.max(res, curV);
                    }
                }
            }
        }
        System.out.println(res);
    }

    private static int check(boolean[][] booleans, int l, int w, int[][] board) {
        if (board[l][w] == 0) {
            return 0;
        }
        int v = board[l][w];
        booleans[l][w] = true;
        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int[] ints : d) {
            int newL = l + ints[0];
            int newW = w + ints[1];
            if (newL >= 0 && newL < board.length && newW >= 0 && newW < board[newL].length && !booleans[newL][newW]) {
                v += check(booleans, newL, newW, board);
            }
        }
        return v;
    }

}
