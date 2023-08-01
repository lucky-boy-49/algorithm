package main.huawei_machine_test;

/**
 * 题目0229-响应报文时间
 */
public class ResponseMessageTime {

    public static void solution(int C, int[] T, int[] M) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < C; i++) {
            if (M[i] < 128) {
                res = Math.min(res, T[i] + M[i]);
            } else {
                int exp = (M[i] & 0x70) >> 4;
                int mant = M[i] & 0x0F;
                int newRes = (mant | 0x10) << (exp + 3);
                res = Math.min(res, T[i] + newRes);
            }
        }
    }

}
