package main.huawei_machine_test;

/**
 * 判断字符串子序列
 */
public class DetermineStringSubsequence {

    public static void solution(String source, String target) {
        char[] sourceCharArray = source.toCharArray();
        char[] targetCharArray = target.toCharArray();
        int j = sourceCharArray.length - 1;
        int i;
        for (i = targetCharArray.length - 1; i >= 0; i--) {
            while (j >= 0) {
                if (targetCharArray[i] == sourceCharArray[j--]) {
                    break;
                }
            }
        }
        if (i == -1) {
            System.out.println(j + 1);
        } else {
            System.out.println(-1);
        }
    }

}
