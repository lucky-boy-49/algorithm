package main.simple;

import java.util.HashMap;

/**
 * 290. 单词规律
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<String, Integer> sMap = new HashMap<>();
        char[] pCharArr = pattern.toCharArray();
        String[] strings = s.split(" ");
        if (pCharArr.length != strings.length) {
            return false;
        }
        for (int i = 0; i < strings.length; i++) {
            if (!pMap.containsKey(pCharArr[i])) {
                pMap.put(pCharArr[i], i);
            }
            if (!sMap.containsKey(strings[i])) {
                sMap.put(strings[i], i);
            }
            if (!pMap.get(pCharArr[i]).equals(sMap.get(strings[i]))) {
                return false;
            }
        }
        return true;
    }

}
