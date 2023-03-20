package simple;
/**
 * 387. 字符串中的第一个唯一字符
 * @author HJ
 */
public class FirstUniqueCharacterInString {

	public int firstUniqChar(String s) {
		int[] temp = new int[26];
		for(int i = 0; i < s.length(); i++) {
			if (temp[s.charAt(i) - 'a'] > 0) {
				temp[s.charAt(i) - 'a'] = -1;
			} else if (temp[s.charAt(i) - 'a'] == 0) {
				temp[s.charAt(i) - 'a'] = i + 1;
			}
		}
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < temp.length; i++) {
			if (temp[i] > 0) {
				result = Math.min(result, temp[i] - 1);
			}
		}
		if (result == Integer.MAX_VALUE) {
			return 0;
		}
		return result;
	}

	public static void main(String[] args){
		String s = "loveleetcode";
		FirstUniqueCharacterInString string = new FirstUniqueCharacterInString();
		int i = string.firstUniqChar(s);
		System.out.println(i);
	}

}