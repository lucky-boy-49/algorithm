package main;

import java.util.*;

/**
 * @author HJ
 * @date 2023/9/12 19:57
 * @description
 */
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        String[] split = s.split(" ");
        int[][] ints = new int[split.length][];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Arrays.stream(split[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<List<int[]>> list1 = new LinkedList<>();
        List<List<int[]>> list2 = new LinkedList<>();
        for (int[] anInt : ints) {
            if (!map1.containsKey(anInt[0])) {
                map1.put(anInt[0], 1);
            } else {
                map1.put(anInt[0], map1.get(anInt[0]) + 1);
            }
            if (!map2.containsKey(anInt[1])) {
                map2.put(anInt[1], 1);
            } else {
                map2.put(anInt[1], map1.get(anInt[1]) + 1);
            }
            int i1 = 0;
            for (; i1 < list1.size(); i1++) {
                int[] ints1 = list1.get(i1).get(0);
                for (int i = 0; i < list1.get(i1).size(); i++) {
                    int[] ints2 = list1.get(i1).get(i);
                    if (ints2[0] - anInt[0] != ints2[1] - anInt[1]) {
                        break;
                    }
                }
                list1.get(i1).add(anInt);
            }
            List<int[]> list = new LinkedList<>();
            list.add(anInt);
            list1.add(list);
            i1 = 0;
            for (; i1 < list2.size(); i1++) {
                int[] ints1 = list2.get(i1).get(0);
                if (ints1[0] - anInt[0] == -(ints1[1] - anInt[1])) {
                    list1.get(i1).add(anInt);
                }
            }
            list = new LinkedList<>();
            list.add(anInt);
            list2.add(list);
        }
        final int[] res = {0};
        map1.forEach((k, v) -> {
            res[0] = Math.max(res[0], k);
        });
        map2.forEach((k, v) -> {
            res[0] = Math.max(res[0], k);
        });
        for (List<int[]> list : list1) {
            res[0] = Math.max(res[0], list.size());
        }
        for (List<int[]> list : list2) {
            res[0] = Math.max(res[0], list.size());
        }
        System.out.println(res[0]);
    }

}
