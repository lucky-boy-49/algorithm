package main.simple;

import java.util.Arrays;

/**
 * @author HJ
 * @version 1.0.0
 * @ClassName RepeatedElements.java
 * @Description 217. 存在重复元素
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * 示例 1：
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * 示例 3：
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 * 提示：
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * @createTime 2023年03月14日 15:35:00
 */
public class RepeatedElements {
    /**
     * @title containsDuplicate
     * @description 
     * @author HJ 
     * @updateTime 2023/3/14 下午3:35 
     * @throws 
     */
    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> maps = new HashMap<>(nums.length);
//        for (int num : nums) {
//            if (!maps.containsKey(num)) {
//                maps.put(num, 1);
//            } else {
//                return true;
//            }
//        }
//        return false;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        RepeatedElements repeatedElements = new RepeatedElements();
        System.out.println(repeatedElements.containsDuplicate(nums));
    }

}
