package main.huawei_machine_test;

import java.util.Arrays;
import java.util.List;

/**
 * @author HJ
 * @date 2023/8/4 11:11
 * @description
 * 相对开音节
 * 题目描述
 * 相对开音节构成的结构为辅音+元音(aeiou)+辅音(r除外)
 * 常见的单词有bike cake
 * 给定一个字符串，以空格为分隔符
 * 反转每个单词的字母
 * 若单词中包含如数字等其他非字母时不进行反转
 * 反转后计算其中含有相对开音节结构的子串个数
 * (连续子串中部分字符可以重复)
 * 输入描述
 * 字符串 以空格分割的多个单词
 * 长度<10000 字母只考虑小写
 * 输出描述
 * 含有相对开音节结构的子串个数
 */
public class RelativelyOpenSyllable {

    public static void solution(String line) {
        String[] words = line.split(" ");

        int count = 0;

        for (String word : words) {
            char[] chars = word.toCharArray();
            String s = word.replaceAll("[a-z]+", "");
            if (word.replaceAll("[a-z]+", "").isEmpty()) {
                for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
            if (chars.length < 4) continue;
            for (int i = 0; i < chars.length - 3; i++) {
                if (isWord(chars[i])
                        && isWord(chars[i + 1])
                        && isWord(chars[i + 2])
                        && isWord(chars[i + 3])
                )
                    if (!isVowel(chars[i])
                            && isVowel(chars[i + 1])
                            && !isVowel(chars[i + 2])
                            && chars[i + 2] != 'r'
                            && chars[i + 3] == 'e') {
                        count++;
                    }
            }
        }
        System.out.print(count);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    private static boolean isWord(char c) {
        return c <= 'z' && c >= 'a';
    }

}
