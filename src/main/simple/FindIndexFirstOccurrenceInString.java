package main.simple;

/**
 * 28. 找出字符串中第一个匹配项的下标
 */
public class FindIndexFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        char[] hs = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        int hLen = hs.length;
        int nLen = nee.length;
        int[] next = getNext(nee);
        while (i < hLen && j < nLen) {
            if (j == -1 || hs[i] == nee[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == nLen) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNext(char[] needles) {
        int len = needles.length;
        int[] next = new int[len];
        int i = -1, j = 0;
        next[0] = -1;
        while (j < len - 1) {
            if (i == -1 || needles[j] == needles[i]) {
                i++;
                j++;
                next[j] = i;
            } else {
                i = next[i];
            }
        }
        return next;
    }

}
