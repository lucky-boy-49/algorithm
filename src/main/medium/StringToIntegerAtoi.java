package main.medium;

/**
 * 8. 字符串转换整数 (atoi)
 */
public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        String trim = s.trim();
        if (trim.isEmpty()) {
            return 0;
        }
        int res = 0, i = 0, flag = 1;
        if (trim.charAt(i) == '-') flag = -1;
        if (trim.charAt(i) == '+' || trim.charAt(i) == '-') i++;
        while (i < trim.length() && Character.isDigit(trim.charAt(i))) {
            int r = trim.charAt(i) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && r > 7)) {
                return flag > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + r;
            i++;
        }
        return flag > 0 ? res : -res;
    }

}
