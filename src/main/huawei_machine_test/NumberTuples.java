package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求符合条件元组个数
 */
public class NumberTuples {

    public static void solution(String line, int k, int target) {
        int[] array = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Arrays.sort(array);
        backtrack(array, 0, k, target, new ArrayList<>(), results);
        System.out.println(results.size());
    }

    private static void backtrack(int[] nums, int start, int k, int target, List<Integer> combination, List<List<Integer>> results) {
        if (k == 2) {
            int left = start;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    combination.add(nums[left]);
                    combination.add(nums[right]);
                    results.add(new ArrayList<>(combination));
                    combination.remove(combination.size() - 1);
                    combination.remove(combination.size() - 1);
                    left++;
                    right--;
                    // 跳过重复的元素，避免结果中出现重复的组合
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        } else {
            for (int i = start; i < nums.length - k + 1; i++) {
                // 跳过重复的元素，避免结果中出现重复的组合
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                combination.add(nums[i]);
                backtrack(nums, i + 1, k - 1, target - nums[i], combination, results);
                combination.remove(combination.size() - 1);
            }
        }
    }

}
