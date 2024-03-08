package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2834. 找出美丽数组的最小和
 */
public class FindMinimumPossibleSumOfBeautifulArray {

    public int minimumPossibleSum(int n, int target) {
        int[] beautifulArray = new int[n];
        beautifulArray[0] = 1;
        List<Integer> list = new ArrayList<>();
        list.add(target - 1);
        int j = 2;
        for (int i = 1; i < n; ) {
            if (!list.contains(j)) {
                beautifulArray[i++] = j;
                list.add(target - j);
            }
            j++;
        }

        return Arrays.stream(beautifulArray).sum();
    }

}
