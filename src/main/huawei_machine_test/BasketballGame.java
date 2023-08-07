package main.huawei_machine_test;

/**
 * 篮球比赛
 */
public class BasketballGame {

    public static void solution(String line) {
        String[] split = line.split(" ");
        int[] players = new int[10];
        int total = 0;
        for (int i = 0; i < 10; i++) {
            players[i] = Integer.parseInt(split[i]);
            total += players[i];
        }

        boolean[][] dp = new boolean[11][total + 1];
        dp[0][0] = true;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= total; j++) {
                if (dp[i - 1][j]) {
                    dp[i][j] = true;
                    if (j + players[i - 1] <= total) {
                        dp[i][j + players[i - 1]] = true;
                    }
                    if (j - players[i - 1] >= 0) {
                        dp[i][j - players[i - 1]] = true;
                    }
                }
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int j = 0; j <= total; j++) {
            if (dp[10][j]) {
                int diff = Math.abs(total - 2 * j);
                minDiff = Math.min(minDiff, diff);
            }
        }

        System.out.println(minDiff);

    }

}
