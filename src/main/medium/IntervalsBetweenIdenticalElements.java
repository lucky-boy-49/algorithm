package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author HJ
 * @date 2023/3/29 20:06
 * @description 2121. 相同元素的间隔之和
 */
public class IntervalsBetweenIdenticalElements {

    public long[] getDistances(int[] arr) {
        //key存储的是值,value集合存储的是相同值对应的下标集合
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], t -> new ArrayList<>()).add(i);
        }
        long[] result = new long[arr.length];
        //遍历map的value
        map.values().forEach(list -> {
            //先计算出当前集合第一个元素所对应的间隔和,后续集合中的其它元素都可根据第一个间隔和推算出来
            list.forEach(i -> {
                result[list.get(0)] += i - list.get(0);
            });
            //遍历其它的相同元素,并根据第集合中第一个元素对应的间隔和推算出来
            for (int i = 1; i < list.size(); i++) {
                long a = 2L * i - list.size();
                int b = list.get(i) - list.get(i - 1);
                result[list.get(i)] = result[list.get(i - 1)] + a * b;
            }
        });
        return result;
    }

    public static void main(String[] args) {
        IntervalsBetweenIdenticalElements elements = new IntervalsBetweenIdenticalElements();
        int[] arr = {2, 1, 3, 1, 2, 3, 3};
        Arrays.stream(elements.getDistances(arr)).forEach(System.out::print);
    }

}
