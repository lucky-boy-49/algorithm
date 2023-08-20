package main.simple;

/**
 * 169. 多数元素
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else {
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }

}
