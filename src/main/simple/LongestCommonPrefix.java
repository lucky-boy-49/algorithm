package main.simple;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 14. 最长公共前缀
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        String s = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get();
        int i;
        label:
        for (i = 1; i <= s.length(); i++) {
            String s2 = s.substring(0, i);
            for (String str : strs) {
                if (!str.startsWith(s2)) {
                    break label;
                }
            }
        }
        ans.append(s, 0, i - 1);
        return ans.toString();

    }

}
