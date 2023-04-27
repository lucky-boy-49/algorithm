package medium;

import java.util.*;

/**
 * @author HJ
 * @date 2023/4/27 16:44
 * @description 1048. 最长字符串链
 */
public class LongestStringChain {

    public int longestStrChain(String[] words) {
        Map<String, Integer> cnt = new HashMap<>(10);
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int res = 0;
        for (String word : words) {
            cnt.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                if (cnt.containsKey(prev)) {
                    cnt.put(word, Math.max(cnt.get(word), cnt.get(prev) + 1));
                }
            }
            res = Math.max(res, cnt.get(word));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        LongestStringChain longestStringChain = new LongestStringChain();
        System.out.println(longestStringChain.longestStrChain(words));
    }

}
