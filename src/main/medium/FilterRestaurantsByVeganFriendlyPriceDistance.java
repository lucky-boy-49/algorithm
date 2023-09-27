package main.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author HJ
 * @date 2023/9/27 18:58
 * @description 1333. 餐厅过滤器
 */
public class FilterRestaurantsByVeganFriendlyPriceDistance {

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> res = new ArrayList<>();
        if (restaurants == null || restaurants.length == 0) {
            return res;
        }
        int[][] array = Arrays.stream(restaurants).filter(a -> {
            if (veganFriendly == 1) {
                return a[2] == 1 && a[3] <= maxPrice && a[4] <= maxDistance;
            } else {
                return a[3] <= maxPrice && a[4] <= maxDistance;
            }
        }).sorted((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        }).toArray(int[][]::new);
        for (int[] ints : array) {
            res.add(ints[0]);
        }
        return res;
    }

    public List<Integer> filterRestaurants2(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> res = new ArrayList<>();
        if (restaurants == null || restaurants.length == 0) {
            return res;
        }
        // 优先级队列
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });
        // 遍历
        for (int[] restaurant : restaurants) {
            if (((veganFriendly == 1 && restaurant[2] == 1) || veganFriendly == 0) && restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                queue.add(restaurant);
            }
        }
        for (int[] ints : queue) {
            res.add(ints[0]);
        }
        return res;
    }

}
