import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "你你好好A1133aa";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        int l = 0, m = 0;
        StringBuilder result = new StringBuilder();
        HashSet<Character> characters = new HashSet<>();
        while (m < charArray.length) {
            if (charArray[l] >= 'a' && charArray[l] <='z' && charArray[m] >= 'a' && charArray[m] <= 'z') {
                if (charArray[l] == charArray[m]) {
                    characters.add(charArray[l]);
                    l = m + 1;
                    m += 1;
                }
            }
            if (charArray[l] <= 'a' || charArray[l] >= 'z') {
                l++;
            }
            if (charArray[m] <= 'a' || charArray[m] >= 'z') {
                m++;
            }
        }
        if (characters.size() == 0) {
            System.out.println("false");
        } else {
            result.append("true ");
            characters.forEach(result::append);
            System.out.println(result.toString());
        }
    }
}