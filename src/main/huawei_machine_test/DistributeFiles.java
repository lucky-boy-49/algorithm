package main.huawei_machine_test;

import java.util.Arrays;
import java.util.LinkedList;

public class DistributeFiles {

    public static void solution(String line) {
        int[] split = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(split);
        for (int cur : split) {
            int i;
            for (i = 0; i < list.size(); i++) {
                Integer v = list.get(i);
                if (v >= cur) {
                    list.set(i, v - cur);
                    break;
                }
            }
            if (i == list.size()) {
                list.add(500 - cur);
            }
        }

    }

}

