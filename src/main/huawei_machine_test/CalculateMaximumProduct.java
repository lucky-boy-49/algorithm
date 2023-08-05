package main.huawei_machine_test;

/**
 * 计算最大乘积
 */
public class CalculateMaximumProduct {

    public static void solution(String line) {
        String[] split = line.split(",");
        int left = 0, right = 1, res = 0;
        label:
        while (left < split.length - 1 && right < split.length) {
            String line1 = split[left];
            String line2 = split[right];
            for (char c : line2.toCharArray()) {
                if (line1.indexOf(c) != -1) {
                    if (right == split.length - 1) {
                        left++;
                        right = left + 1;
                    } else {
                        right++;
                    }
                    continue label;
                }
            }
            int i = line1.length() * line2.length();
            res = Math.max(res, i);
            if (right == split.length - 1) {
                left++;
                right = left + 1;
            }
            right++;
        }
        System.out.println(res);
    }

}
