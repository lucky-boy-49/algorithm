package main.simple;

/**
 * 2129. 将标题首字母大写
 */
public class CapitalizeTheTitle {

    public String capitalizeTitle(String title) {
        String lowerCase1 = title.toLowerCase();
        String[] word = lowerCase1.split(" ");
        StringBuilder res = new StringBuilder();
        int i;
        for (i = 0; i < word.length; i++) {
            String s = word[i];
            if (s.length() == 1 || s.length() == 2) {
                res.append(s).append(" ");
            } else {
                res.append((s.substring(0, 1)).toUpperCase()).append(s.substring(1)).append(" ");
            }
        }
        return res.toString().trim();
    }

    public String capitalizeTitleTwo(String title) {
        char[] str = title.toCharArray();
        int preIndex = -1;
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == ' ') {
                int distance = i - preIndex - 1;
                if (distance > 2) {
                    str[preIndex + 1] = (char) (str[preIndex + 1] - 32);
                }
                preIndex = i;
            }
            else if (c >= 'A' && c <= 'Z') {
                str[i] = (char) (str[i] + 32);
            }
        }
        if (str.length - preIndex > 3) {
            str[preIndex + 1] = (char) (str[preIndex + 1] - 32);
        }
        return String.valueOf(str);
    }

}
