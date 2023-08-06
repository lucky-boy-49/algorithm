package main.huawei_machine_test;

import java.util.Arrays;
import java.util.List;

/**
 * 整型数组按个位值排序
 */
public class SortSinglePlaceValue {

    public static void solution(String line) {
        String[] array = line.split(",");
        List<String> list = Arrays.asList(array);
        list.sort((v1, v2) -> {
            int value1 = Integer.parseInt(v1);
            int value2 = Integer.parseInt(v2);
            int sing1 = Math.abs(value1 % 10);
            int sing2 = Math.abs(value2 % 10);
            return sing1 - sing2;
        });
        StringBuilder res = new StringBuilder();
        list.forEach(s -> res.append(s).append(","));
        System.out.println(res.substring(0, res.length() - 1));
    }

}
