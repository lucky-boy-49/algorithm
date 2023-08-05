package main.huawei_machine_test;

/**
 * 非严格递增连续数字序列
 * 题目描述
 * 输入一个字符串仅包含大小写字母和数字
 * 求字符串中包含的最长的非严格递增连续数字序列长度
 * 比如：
 * 12234属于非严格递增数字序列
 * 输入描述
 * 输入一个字符串仅包含大小写字母和数字
 * 输出描述
 * 输出字符串中包含的最长的非严格递增连续数字序列长度
 */
public class IncreasingContiguousSequence {

    public static void solution(String line) {
        char[] chars = line.toCharArray();
        int curLen = 0, maxLen = 0;

        char last = 'a';
        for (char cur : chars) {
            if (Character.isDigit(cur)) {
                if (curLen == 0 || cur >= last) {
                    curLen++;
                } else {
                    if (curLen > maxLen) {
                        maxLen = curLen;
                    }
                    curLen = 1;
                }
                last = cur;
            } else {
                if (curLen > maxLen) maxLen = curLen;
                curLen = 0;
                last = 'a';
            }
        }
        maxLen = Math.max(curLen, maxLen);
        System.out.print(maxLen);
    }

}
