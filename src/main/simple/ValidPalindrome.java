package main.simple;

/**
 * 125. 验证回文串
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        if (sb.isEmpty()) {
            return true;
        }
        if (sb.length() == 1) {
            return false;
        }
        s = sb.toString();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
