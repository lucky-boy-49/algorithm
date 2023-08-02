package main.huawei_machine_test;

/**
 * 最长公共后缀
 */
public class MatchScore {

    public static void solution(String line) {
        line = line.substring(1, line.length() - 1);
        String[] split = line.split(",");
        int minLen = Integer.MAX_VALUE;
        for (String s : split) {
            minLen = Math.min(minLen, s.length());
        }
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= minLen - 2; i++) {
            char c = split[0].charAt(split[0].length() - 1 - i);
            int flag = 0;
            for (int j = 1; j < split.length; j++) {
                char c1 = split[j].charAt(split[j].length() - 1 - i);
                if (c == c1) flag++;
            }
            if (flag == split.length - 1) res.append(c);
        }

        if (res.isEmpty()) {
            System.out.println("@Zero");
        } else {
            System.out.println("\"" + res.reverse() + "\"");
        }

    }

}
