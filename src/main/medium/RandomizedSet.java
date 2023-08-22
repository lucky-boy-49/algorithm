package main.medium;

import java.util.*;

/**
 * 380. O(1) 时间插入、删除和获取随机元素
 */
public class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> indices;
    Random random;

    public RandomizedSet() {
        nums = new ArrayList<>();
        indices = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indices.containsKey(val)) {
            return false;
        }
        int index = nums.size();
        nums.add(val);
        indices.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        if (indices.containsKey(val)) {
            int index = indices.get(val);
            int last = nums.get(nums.size() - 1);
            nums.set(index, last);
            indices.put(last, index);
            nums.remove(nums.size() - 1);
            indices.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int index = random.nextInt(nums.size());
        return nums.get(index);
    }

}
