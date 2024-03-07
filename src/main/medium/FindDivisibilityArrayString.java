package main.medium;

/**
 * 2575. 找出字符串的可整除数组
 * @author jiahe
 */
public class FindDivisibilityArrayString {

    public int[] divisibilityArray(String word, int m) {
        int[] result = new int[word.length()];
        int i = 0;
        long j = 0;
        for (char c : word.toCharArray()) {
            j = (j * 10 + (c - '0')) % m;
            if (j == 0) {
                result[i] = 1;
            }
            i++;
        }
        return result;
    }

}
