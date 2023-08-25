package main.difficulty;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 */
public class MinimumWindowSubstring {

    private final HashMap<Character, Integer> map1 = new HashMap<>();
    private final HashMap<Character, Integer> map2 = new HashMap<>();

    public String minWindow(String s, String t) {
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1, sLen = s.length();
        while (right < sLen) {
            ++right;
            if (right < sLen && map1.containsKey(s.charAt(right))) {
                map2.put(s.charAt(right), map2.getOrDefault(s.charAt(right), 0) + 1);
            }
            while (check() && left <= right) {
                if (right - left + 1 < len) {
                    len = right - left + 1;
                    ansL = left;
                    ansR = left + len;
                }
                if (map1.containsKey(s.charAt(left))) {
                    map2.put(s.charAt(left), map2.getOrDefault(s.charAt(left), 0) - 1);
                }
                ++left;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    private boolean check() {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (map2.getOrDefault(key, 0) < value) {
                return false;
            }
        }
        return true;
    }

}
