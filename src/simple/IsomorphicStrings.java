package simple;

import java.util.Arrays;

/**
 * 205. 同构字符串
 * @PackageName simple
 * @ClassName IsomorphicStrings
 * @author HJ
 * @Date 2023/3/29 18:57
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sArray = new int[s.length()], tArray = new int[t.length()];
        for (int i = 0; i < s.length(); i++) {
            int j = s.indexOf(s.charAt(i));
            sArray[i] = j;
            j = t.indexOf(t.charAt(i));
            tArray[i] = j;
        }
        return Arrays.equals(sArray, tArray);
        
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        String s = "egg", t = "add";
        System.out.println(isomorphicStrings.isIsomorphic(s, t));
    }

}
