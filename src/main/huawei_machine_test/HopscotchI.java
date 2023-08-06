package main.huawei_machine_test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 跳房子I
 */
public class HopscotchI {

    public static void solution(String line, int count) {
        LinkedList<int[]> list = new LinkedList<>();
        String[] split = line.split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replaceAll("[\\[\\]]", "");
        }
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == count) {
                    int[] ints = {i, j, i + j};
                    list.add(ints);
                }
            }
        }
        list.sort((v1, v2) -> v1[2] - v2[2]);
        int[] res = list.get(0);
        System.out.printf("[%d,%d]", array[res[0]], array[res[1]]);
    }

}
