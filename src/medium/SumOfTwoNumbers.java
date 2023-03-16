package medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author HJ
 * 167. 两数之和 II - 输入有序数组
 */
public class SumOfTwoNumbers {

    public int[] twoSum(int[] numbers, int target) {
        // 第一种
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(numbers[i])) {
//                return new int[]{map.get(numbers[i])+1, i+1};
//            } else {
//                map.put(target - numbers[i], i);
//            }
//        }
//        return new int[]{-1, -1};

        // 第二种 二分查找
//        int low, high, mid;
//        for(int i = 0; i < numbers.length; i++) {
//            low = i+1;  high = numbers.length - 1;
//            while (low <= high) {
//                mid = (high - low) / 2 + low;
//                if (numbers[mid] == target - numbers[i]) {
//                    return new int[] {i + 1, mid + 1};
//                } else if (numbers[mid] < target - numbers[i]) {
//                    low = mid + 1;
//                } else {
//                    high = mid - 1;
//                }
//            }
//        }
//        return new int[] {-1, -1};

        // 第三种 双指针
//        int low = 0, hight = numbers.length - 1, sum;
//        while (low < hight) {
//            sum = numbers[low] + numbers[hight];
//            if (sum == target) {
//                return new int[] {low + 1, hight + 1};
//            } else if (sum < target) {
//                low++;
//            } else {
//                hight--;
//            }
//        }
//        return new int[] {-1, -1};

        // 第四种 双指针+二分
        int low = 0, hight = numbers.length - 1, mid;
        while (low < hight) {
            mid = (low + hight) >>> 1;
            if (numbers[low] + numbers[mid] > target) {
                hight = mid - 1;
            } else if (numbers[mid] + numbers[hight] < target) {
                low = mid + 1;
            } else if (numbers[low] + numbers[hight] > target) {
                hight--;
            } else if (numbers[low] + numbers[hight] < target) {
                low++;
            } else {
                return new int[] {low + 1, hight + 1};
            }
        }
        return new int[] {-1, -1};

    }

    public static void main(String[] args){
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ints = sumOfTwoNumbers.twoSum(numbers, target);
        Arrays.stream(ints).forEach(System.out::println);
    }

}