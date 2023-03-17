package simple;
/**
 * @author HJ
 * 557. 反转字符串中的单词 III
 */
public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String result = "";
        for(int i = 0; i < split.length; i++) {
            char[] chars = split[i].toCharArray();
            String s1 = "";
            for(int j = chars.length - 1; j >= 0; j--) {
                s1 += chars[j];
            }
            if (i == split.length - 1) {
                result += s1;
            } else {
                result += s1 + " ";
            }

        }
        return result;
    }

    public static void main(String[] args){
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        String s = "Let's take LeetCode contest";
        String result = reverseWordsInString.reverseWords(s);
        System.out.println(result);
    }

}