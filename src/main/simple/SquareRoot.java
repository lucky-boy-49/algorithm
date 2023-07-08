package main.simple;

/**
 * x的平方根
 */
public class SquareRoot {

    /**
     * 二分法
     * @param x 待开方数
     * @return 开放结果
     */
    public int binarySearch(int x) {
        int index = -1, l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (mid * mid <= x && (mid+1) * (mid+1) > x) {
                index = mid;
                break;
            } else if (mid * mid <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    /**
     * 牛顿迭代
     * @param x 待开方数
     * @return 开放结果
     */
    public double newTon(int x) {
        double i = x, res;
        while ((res = (i + x/i)/2) != i) {
            i = res;
        }
        return res;
    }

}
