package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * 找最小数
 */
public class FindMinimum {

    public static void solution(String num1, int num2) {
        char[] charArray = num1.toCharArray();
        LinkedList<Integer> list = new LinkedList<>();
        for (char c : charArray) {
            list.add(Integer.valueOf(String.valueOf(c)));
        }
        list.sort((v1, v2) -> v2 - v1);
        int i = 0;
        while (i < num2) {
            int minIndex = 0, minValue = Integer.MAX_VALUE, minI = -1;
            for (int j = 0; j < list.size(); j++) {
                Integer v = list.get(j);
                int index = num1.indexOf(v.toString());
                String cur = num1.substring(0, index) + num1.substring(index + 1);
                int curValue = Integer.parseInt(cur);
                if (curValue < minValue) {
                    minValue = curValue;
                    minIndex = index;
                    minI = j;
                }
            }
            list.remove(minI);
            num1 = num1.substring(0, minIndex) + num1.substring(minIndex + 1);
            i++;
        }
        System.out.println(num1);
    }

}
