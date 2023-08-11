package main.simple;

/**
 * 是否回文
 */
public class IsPalindrome {

    public boolean solution(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        int j = len - 1;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(j) && i != j) {
                return false;
            }
            j--;
        }
        return true;
    }

}
