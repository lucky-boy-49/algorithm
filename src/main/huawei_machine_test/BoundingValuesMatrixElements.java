package main.huawei_machine_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 矩阵元素的边界值
 */
public class BoundingValuesMatrixElements {

    public static void solution(String line) {
        String[] split = line.split("],\\[");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replaceAll("[\\[\\]]", "");
        }
        LinkedList<int[]> list = new LinkedList<>();
        for (String s : split) {
            int[] array = Arrays.stream(s.split(","))
                    .mapToInt(Integer::parseInt).toArray();
            list.add(array);
        }
        LinkedList<Integer> list2 = new LinkedList<>();
        list.forEach(v -> {
            for (int i = 0; i < v.length; i++) {
                if (list2.size() < v.length) {
                    list2.add(i, v[i]);
                } else {
                    Integer lastV = list2.get(i);
                    list2.set(i, Math.max(v[i], lastV));
                }
            }
        });
        List<Integer> i = list2.stream().min(Integer::compareTo).stream().toList();
        System.out.println(i.get(0));
    }

}
