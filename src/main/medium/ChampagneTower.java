package main.medium;

/**
 * 799. Champagne Tower
 */
public class ChampagneTower {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[100][100];
        dp[0][0] = poured;

        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double d = (dp[i][j] - 1.0) / 2;
                if (d > 0 && i + 1 < 100) {
                    dp[i + 1][j] += d;
                    dp[i + 1][j + 1] += d;
                }
            }
        }

        return Math.min(1.0, dp[query_row][query_glass]);

    }

    public double champagneTower2(int poured, int query_row, int query_glass) {
        double[] row = {poured};
        for (int i = 1; i <= query_row; i++) {

            double[] nextRow = new double[i + 1];
            for (int j = 0; j < i; j++) {
                double v = row[j];
                if (v > 1) {
                    nextRow[j] += (v - 1) / 2;
                    nextRow[j + 1] += (v - 1) / 2;
                }
            }
            row = nextRow;
        }
        return Math.min(1, row[query_glass]);
    }

}
