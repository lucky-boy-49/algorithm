package main.simple;

/**
 * @author HJ
 * @version 1.0.0
 * @ClassName BinarySearch.java
 * @Description 二分查找算法
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 * @createTime 2023年03月14日 14:11:00
 */
public class BinarySearch {

    /**
     * @title search
     * @description 
     * @author HJ 
     * @updateTime 2023/3/14 下午2:14 
     * @throws 
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        BinarySearch binarySearch = new BinarySearch();
        int search = binarySearch.search(nums, target);
        System.out.println(search);
    }

}
