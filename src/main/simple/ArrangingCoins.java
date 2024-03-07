package main.simple;

/**
 * 441. Arranging Coins
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }
        int current = 0, i = 0; 
        while (current + i < n) {
            current += ++i;
            if (n - current < i + 1) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 二分查找
     * @param n 硬币总数
     * @return 能排列完整的层数
     */
    public int arrangeCoins2(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    /**
     * 数学
     * @param n 硬币总数
     * @return 能排列完整的层数
     */
    public int arrangeCoins3(int n) {
        return (int) (Math.sqrt((long) 8 * n + 1) - 1) / 2;
    }

}
