package main.medium;

/**
 * 151. 反转字符串中的单词
 */
public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length(); i > 0; ) {
            int r = i, l;
            while (r > 0 && s.charAt(r - 1) == ' ') r--;
            l = r;
            while (l > 0 && s.charAt(l - 1) != ' ') l--;
            ans.append(s, l, r).append(" ");
            i = l;
        }
        return ans.toString().trim();
    }

}
