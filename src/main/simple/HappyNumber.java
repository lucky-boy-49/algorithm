package main.simple;

import java.util.HashMap;

/**
 * 202. 快乐数
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a = n;
        while (a != 1) {
            int cur = 0;
            while (a != 0) {
                cur += (int) Math.pow(a % 10, 2);
                a /= 10;
            }
            if (map.containsKey(cur)) {
                return false;
            }
            map.put(cur, 1);
            a = cur;
        }
        return true;
    }

}
