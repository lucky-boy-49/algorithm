package test.medium;

import main.medium.FilterRestaurantsByVeganFriendlyPriceDistance;
import org.junit.jupiter.api.Test;

/**
 * @author HJ
 * @date 2023/9/27 19:15
 * @description
 */
class FilterRestaurantsByVeganFriendlyPriceDistanceTest {

    @Test
    void filterRestaurants() {
        int[][] restaurants = new int[][] {
            {1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}
        };
        FilterRestaurantsByVeganFriendlyPriceDistance filter = new FilterRestaurantsByVeganFriendlyPriceDistance();
        System.out.println(filter.filterRestaurants(restaurants, 1, 50, 10).toString());
        System.out.println(filter.filterRestaurants2(restaurants, 1, 50, 10).toString());
    }
}