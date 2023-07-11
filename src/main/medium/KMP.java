package main.medium;

/**
 * 字符串搜索
 */
public class KMP {

    public int search(char[] str, char[] pattern) {
        int[] next = getNext(pattern);
        int i = 0, j = 0;
        while (i < str.length && j < pattern.length) {
            if (j == -1 || str[i] == pattern[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pattern.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public int[] getNext(char[] pattern) {
        int[] next = new int[pattern.length];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < pattern.length) {
            if (j == -1) {
                i++;
                j++;
            } else if (pattern[i] == pattern[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }

}
