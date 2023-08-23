package main.simple;

/**
 * 58. 最后一个单词的长度
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }

}
