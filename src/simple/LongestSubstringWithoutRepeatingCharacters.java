package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * @author HJ
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		// 自己
//		int result = 0;
//		Map<Character, Integer> map = new HashMap<>();
//		char[] chars = s.toCharArray();
//		if (chars.length == 1) {
//			return 1;
//		}
//		for(int i = 0; i < chars.length; i++) {
//			for(int j = i; j < chars.length; j++) {
//				if (map.containsKey(chars[j])) {
//					if (result < map.size()) {
//						result = map.size();
//					}
//					map.clear();
//					break;
//				} else {
//					map.put(chars[j], 1);
//				}
//			}
//		}
//		return result;
		// 滑动窗口
		if (s.isEmpty()) {
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0, left = 0;
		for(int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				left = Math.max(left, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - left + 1);
		}
		return max;
	}

	public static void main(String[] args){
		LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();
		String s = "abcabcbb";
		int i = characters.lengthOfLongestSubstring(s);
		System.out.println(i);
	}

}