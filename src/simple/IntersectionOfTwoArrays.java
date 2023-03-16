package simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author HJ
 * 350. 两个数组的交集 II
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        // 自己写
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        LinkedList<Integer> list = new LinkedList<>();
//        int i = 0, j = 0;
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] == nums2[j]) {
//                list.add(nums1[i++]);
//                j++;
//            } else if (nums1[i] < nums2[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();

        // 哈希表
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] num1 = {1, 2, 2, 1}, num2 = {2, 2};
        int[] resuit = intersectionOfTwoArrays.intersect(num1, num2);
        Arrays.stream(resuit).forEach(System.out::println);
    }

}