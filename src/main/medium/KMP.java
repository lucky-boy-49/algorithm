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

    public int indexOf(String source, String pattern) {
        int i = 0, j = 0;
        char[] src = source.toCharArray();
        char[] ptn = pattern.toCharArray();
        int sLen = src.length;
        int pLen = ptn.length;
        int[] next = getNext(ptn);
        while (i < sLen && j < pLen) {
            // 如果j = -1,或者当前字符匹配成功(src[i] = ptn[j]),都让i++,j++
            if (j == -1 || src[i] == ptn[j]) {
                i++;
                j++;
            } else {
                // 如果j!=-1且当前字符匹配失败,则令i不变,j=next[j],即让pattern模式串右移j-next[j]个单位
                j = next[j];
            }
        }
        if (j == pLen)
            return i - j;
        return -1;
    }

    public int[] getNext(char[] pattern) {
//        int[] next = new int[pattern.length];
//        next[0] = -1;
//        int i = 0, j = -1;
//        while (i < pattern.length) {
//            if (j == -1) {
//                i++;
//                j++;
//            } else if (pattern[i] == pattern[j]) {
//                i++;
//                j++;
//                next[i] = j;
//            } else {
//                j = next[j];
//            }
//        }
//        return next;

        int pLen = pattern.length;
        int[] next = new int[pLen];
        int k = -1;
        int j = 0;
        next[0] = -1; // next数组中第一位next[0]为-1
        while (j < pLen - 1) {
            if (k == -1 || pattern[j] == pattern[k]) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;

    }

}
