package medium;

import java.util.Arrays;

/**
 * @author HJ
 * @date 2023/3/29 19:47
 * @description 1641. 统计字典序元音字符串的数目
 */
public class CountSortedVowelStrings {

    public int countVowelStrings(int n) {
        // 多态规划
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.stream(dp).sum();
    }

    public static void main(String[] args) {
        CountSortedVowelStrings strings = new CountSortedVowelStrings();
        System.out.println(strings.countVowelStrings(2));
    }

}
