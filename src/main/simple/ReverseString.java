package main.simple;
/**
 * @author HJ
 * 344. 反转字符串
 */
public class ReverseString {

    public void reverseString(char[] s) {
        char temp;
        for(int i = 0; i < s.length / 2; i++) {
          temp = s[i];
          s[i] = s[s.length - i - 1];
          s[s.length - i - 1] = temp;
        }
    }

    public static void main(String[] args){
        ReverseString reverseString = new ReverseString();
        char[] s = {'h', 'e', 'l', 'l', 'e'};
        reverseString.reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }

}