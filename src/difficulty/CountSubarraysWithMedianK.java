package difficulty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HJ
 * 2488. 统计中位数为 K 的子数组
 */
public class CountSubarraysWithMedianK {

    public int countSubarrays(int[] nums, int k) {
        // 自己
//        Arrays.sort(nums);
//        int index =  0, low = 0, hight = nums.length - 1, mid, resuit = 0;
//        while (low <= hight) {
//            mid = (hight - low) / 2 + low;
//            if (nums[mid] == k) {
//                index = mid;
//                break;
//            } else if (nums[mid] < k) {
//                low = mid + 1;
//            } else {
//                hight = mid - 1;
//            }
//        }
////        resuit++;
//        low = index;
//        hight = index;
//        while (low >= 0 && hight < nums.length) {
//            if (resuit % 2 != 1) {
//                hight++;
//            } else {
//                low--;
//            }
//            resuit++;
//        }
//        return resuit;

        // 答案
        int n = nums.length;
        // kIndex表示k在数组中的下标
        int kIndex = -1;
        // 找到k的下标位置
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                kIndex = i;
                break;
            }
        }
        int ans = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        // 表示转换后的数组的前缀和
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sign(nums[i] - k);
            // 如果 “i<kIndex” 则下标 “i+1” 可以作为中位数等于 “k” 的非空子数组的开始下标，
            // 将 “sum” 在哈希表中的出现次数加 “1”；
            // 
            if (i < kIndex) {
                counts.put(sum, counts.getOrDefault(sum, 0) + 1);
            } else {
                int prev0 = counts.getOrDefault(sum, 0);
                int prev1 = counts.getOrDefault(sum - 1, 0);
                ans += prev0 + prev1;
            }
        }
        return ans;
    }

    private int sign(int num) {
        if (num == 0) {
            return 0;
        }
        return num > 0 ? 1 : -1;
    }

    public static void main(String[] args){
        CountSubarraysWithMedianK countSubarraysWithMedianK = new CountSubarraysWithMedianK();
        int[] nums = {2, 5, 1, 4, 3, 6};
        int k = 1;
        int resuit = countSubarraysWithMedianK.countSubarrays(nums, k);
        System.out.println(resuit);
    }

}