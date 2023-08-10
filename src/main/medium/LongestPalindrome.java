package main.medium;

/**
 * 最长回文子串
 */
public class LongestPalindrome {

    public String solution(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        boolean[][] dp = new boolean[length][length];
        int maxLen = 1, begin = 0;
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();

        for (int i = 2; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                int k = i + j - 1;
                if (k >= length) {
                    break;
                }
                if (charArray[j] != charArray[k]) {
                    dp[j][k] = false;
                } else {
                    if (j - i < 3) {
                        dp[j][k] = true;
                    } else {
                        dp[j][k] = dp[j + 1][k - 1];
                    }
                }
                if (dp[j][k] && k - j + 1 >= maxLen) {
                    maxLen = k - j + 1;
                    begin = j;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

}
