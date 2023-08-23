package main.simple;

/**
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] charArray = s.toCharArray();
        int left = -1, right = -1;
        for (int i = charArray.length - 1; i > -1; i--) {
            if (charArray[i] != ' ' && right == -1) {
                right = i;
            } else if (charArray[i] == ' ' && right != -1) {
                left = i;
                break;
            }
        }
        return right - left;
    }

}
