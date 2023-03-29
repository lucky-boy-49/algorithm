package simple;
/**
 * @author HJ
 * @date 2023/3/29 19:30
 * @description 392. 判断子序列
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int i = 0, j = -1;
        while (i < s.length()) {
            int k = t.indexOf(s.charAt(i), j);
            if (k != -1) {
                j = ++k;
            } else {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        String s = "aaaaaa", t = "bbaaaa";
        System.out.println(isSubsequence.isSubsequence(s, t));
    }

}
