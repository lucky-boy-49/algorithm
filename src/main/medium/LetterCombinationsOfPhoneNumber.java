package main.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 */
public class LetterCombinationsOfPhoneNumber {

    private static final Map<Character, char[]> map = new HashMap<>();
    private static StringBuilder s = new StringBuilder();

    static {
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        char[] charArray = digits.toCharArray();
        List<String> result = new ArrayList<>();
        if (charArray.length > 0) {
            dfs(charArray, 0, result);
        }
        return result;
    }

    private void dfs(char[] charArray, int i, List<String> result) {
        char c = charArray[i];
        for (char c1 : map.get(c)) {
            s.append(c1);
            if (charArray.length == i + 1) {
                result.add(s.toString());
            } else {
                dfs(charArray, i + 1, result);
            }
            s.deleteCharAt(s.length() - 1);
        }
    }

}
