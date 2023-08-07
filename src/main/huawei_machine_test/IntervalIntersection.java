package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * 区间列表的交集
 */
public class IntervalIntersection {

    public static void solution(String[] sArray) {
        LinkedList<int[]> list = new LinkedList<>();
        for (String s : sArray) {
            String[] split = s.split(" ");
            int[] ints = new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
            list.add(ints);
        }
        LinkedList<int[]> list2 = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int[] v1 = list.get(i);
                int[] v2 = list.get(j);
                if (v1[0] <= v2[1] && v2[0] <= v1[1]) {
                    int[] ints = {Math.max(v1[0], v2[0]), Math.min(v1[1], v2[1])};
                    list2.add(ints);
                }
            }
        }
        LinkedList<int[]> list3 = new LinkedList<>();
        for (int i = 0; i < list2.size(); i++) {
            for (int j = i + 1; j < list2.size(); j++) {
                int[] v1 = list2.get(i);
                int[] v2 = list2.get(j);
                if (v1[0] <= v2[1] && v2[0] <= v1[1]) {
                    int[] ints = {Math.min(v1[0], v2[0]), Math.max(v1[1], v2[1])};
                    list2.add(ints);
                    list2.remove(i);
                    list2.remove(j--);
                }
            }
        }
        if (!list2.isEmpty()) {
            list3.addAll(list2);
        }
        list3.sort((v1, v2) -> {
            if (v1[0] == v2[0]) {
                return v1[1] - v2[1];
            } else {
                return v1[0] - v2[0];
            }
        });
        list3.forEach(v -> {
            System.out.println(v[0] + " " + v[1]);
        });
    }

}
