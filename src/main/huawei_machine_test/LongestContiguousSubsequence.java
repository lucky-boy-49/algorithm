package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 最长连续子序列
 */
public class LongestContiguousSubsequence {

    public static void solution(String line, int sum) {
        int[] array = Arrays.stream(line.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int res = -1, left = 0, right = 1, curSum = array[left];

        while (right < array.length) {
            curSum += array[right];
            if (curSum == sum) {
                int curLen = right - left + 1;
                res = Math.max(res, curLen);
                right++;
            } else if (curSum > sum) {
                curSum -= array[left++];
                curSum -= array[right];
            } else {
                right++;
            }
        }

        System.out.println(res);
    }

}
