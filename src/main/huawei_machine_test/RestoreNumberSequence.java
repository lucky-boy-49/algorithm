package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0247-恢复数字序列
 * 题目描述
 * 对于一个连续正整数组成的序列，可以将其拼接成一个字符串，再将字符串里的部分字符打乱顺序。如序列8 9 10 11 12，拼接成的字符串为89101112，打乱一部分字符后得到90811211。注意打乱后原来的正整数可能被拆开，比如在90811211中，原来的正整数10就被拆成了0和1。
 * 现给定一个按如上规则得到的打乱了字符的字符串，请将其还原成连续正整数序列，并输出序列中最小的数字。
 * 输入描述
 * 输入一行，为打乱字符的字符串和正整数序列的长度，两者间用空格分隔，字符串长度不超过200，正整数不超过1000，保证输入可以还原成唯一序列.
 * 输出描述
 * 输出一个数字，为序列中最小的数字
 */
public class RestoreNumberSequence {

    public static void solution(String lines, int len) {
        int n = lines.length();
        char[] charArray = lines.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        int totalAsciiSum = totalAsciiSum(lines);

        int minNumLen = n / len;
        int minNum = -1;

        for (int i = 0; i < 9; i++) {
            String candidate = i + sortedStr.substring(0, minNumLen - 1);
            int num = Integer.parseInt(candidate);
            if (totalAsciiSum(generateSequence(num, len)) == totalAsciiSum) {
                minNum = num;
                break;
            }
        }
        System.out.println(minNum);

    }

    private static String generateSequence(int startNum, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(startNum + i);
        }
        return sb.toString();
    }

    private static int totalAsciiSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

}
