package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 根据某条件聚类最少交换次数
 */
public class ClusteringMinimumNumberExchanges {

    public static void solution(String line, int k) {
        int[] array = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        int left = 0, right = array.length - 1, res = 0;
        while (left < right) {
            if (array[left] < k) {
                left++;
            } else {
                while (array[right] >= k) right--;
                int tmp = array[left];
                array[left++] = array[right];
                array[right--] = tmp;
                res++;
            }

        }

        System.out.println(res);

    }

}
