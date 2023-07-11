package main.simple;

/**
 * 509 . 斐波那契数列
 */
public class FibonacciNumber {

    /**
     * 暴力解法
     * @param n 需要找到的位数
     * @return 斐波那契数列结果
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int prve1 = 0, prve2 = 1, tmp;

        for (int i = 1; i < n; i++) {
            tmp = prve1 + prve2;
            prve2 = prve1;
            prve1 = tmp;
        }

        return prve1 + prve2;

    }

    /**
     * 通项公式
     * @param n 需要找到的位数
     * @return 斐波那契数列结果
     */
    public int fib2(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibN = Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n);
        return (int) Math.round(fibN / sqrt5);
    }

    public int fib3(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int pre = 0, next = 1;
        for (int i = 2; i < n; i++) {
            int tmp = pre + next;
            pre = next;
            next = tmp;
        }
        return next;
    }

}
