package medium;

import java.util.Arrays;

/**
 * @author HJ
 * 881. 救生艇
 */
public class Lifeboat {

    public int numRescueBoats(int[] people, int limit) {
        // 贪心
        int result = 0;
        Arrays.sort(people);
        int light = 0, heavy = people.length - 1;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                ++light;
            }
            --heavy;
            ++result;
        }
        return result;
    }

    public static void main(String[] args){
        Lifeboat lifeboat = new Lifeboat();
        int[] people = {5, 1, 4, 2};
        int limit = 6;
        System.out.println(lifeboat.numRescueBoats(people, limit));
    }

}