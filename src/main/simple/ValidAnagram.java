package main.simple;

import java.util.HashMap;

/**
 * 242. 有效的字母异位词
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> mapS = new HashMap<>();
		HashMap<Character, Integer> mapT = new HashMap<>();
		toMap(s, mapS);
		toMap(t, mapT);
		return mapS.equals(mapT);
	}

	private void toMap(String s, HashMap<Character, Integer> map) {
		for(int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
	}

	public static void main(String[] args){
		String s = "anagram", t = "nagaram";
		ValidAnagram anagram = new ValidAnagram();
		boolean result = anagram.isAnagram(s, t);
		System.out.println(result);
	}

}