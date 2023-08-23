package main.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 */
public class RomanToInt {

    private final Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            int pre = map.get(charArray[i - 1]);
            int next = map.get(charArray[i]);
            if (pre < next) {
                ans -= pre;
            } else {
                ans += pre;
            }
        }
        ans += map.get(charArray[charArray.length - 1]);
        return ans;
    }

}
