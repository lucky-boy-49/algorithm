package main.medium;

/**
 * 1281. 整数的各位积和之差
 */
public class SubtractProductAndSum {

    public int solution(int n) {
        int res1 = 1, res2 = 0;
        ;
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            int i1 = n % 10;
            res1 *= i1;
            res2 += i1;
            n /= 10;
        }
        return res1 - res2;
    }

}
