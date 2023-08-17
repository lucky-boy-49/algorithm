package main.medium;

/**
 * 7. 整数反转
 */
public class ReverseInteger {

    public int reverse(int x) {
        long abs = Math.abs((long) x);
        if (abs % 10 == 0) {
            abs /= 10;
        }
        StringBuilder res = new StringBuilder(String.valueOf(abs));
        res.reverse();
        long l = Long.parseLong(res.toString());
        if (x < 0) {
            l = -l;
        }
        if (l < (-Math.pow(2, 31)) || l > (Math.pow(2, 31) - 1)) {
            return 0;
        }
        return (int) l;
    }

    public int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            int last = x % 10;
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = last + res * 10;
            x /= 10;

        }
        return res;
    }

}
