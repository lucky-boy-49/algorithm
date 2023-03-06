package simple;

import java.util.Arrays;

/**
 * 类Solution
 * 用于：TODO
 * 2389. 和有限的最长子序列
 * 给你一个长度为 n 的整数数组 nums ，和一个长度为 m 的整数数组 queries 。
 * 返回一个长度为 m 的数组 answer ，其中 answer[i] 是 nums 中 元素之和小于等于 queries[i] 的 子序列 的 最大 长度  。
 * 子序列 是由一个数组删除某些元素（也可以不删除）但不改变剩余元素顺序得到的一个数组。
 * 示例 1：
 * 输入：nums = [4,5,2,1], queries = [3,10,21]
 * 输出：[2,3,4]
 * 解释：queries 对应的 answer 如下：
 * - 子序列 [2,1] 的和小于或等于 3 。可以证明满足题目要求的子序列的最大长度是 2 ，所以 answer[0] = 2 。
 * - 子序列 [4,5,1] 的和小于或等于 10 。可以证明满足题目要求的子序列的最大长度是 3 ，所以 answer[1] = 3 。
 * - 子序列 [4,5,2,1] 的和小于或等于 21 。可以证明满足题目要求的子序列的最大长度是 4 ，所以 answer[2] = 4 。
 * 示例 2：
 * 输入：nums = [2,3,4,5], queries = [1]
 * 输出：[0]
 * 解释：空子序列是唯一一个满足元素和小于或等于 1 的子序列，所以 answer[0] = 0 。
 * 提示：
 * n == nums.length
 * m == queries.length
 * 1 <= n, m <= 1000
 * 1 <= nums[i], queries[i] <= 106
 * @author HJ
 * @version 1.0
 * @date 2023/2/26
 */
public class Solution {

    public int[] answerQueries(int[] nums, int[] queries) {
        // 对数组nums继续升序排序
        Arrays.sort(nums);
        int m = queries.length;
        int[] answer = new int[m];
        // 循环进行判断
        int query, size, sum;
        for (int i = 0; i < m; i++) {
            query = queries[i];
            size = 0;
            sum = 0;
            for (int num : nums) {
                if (sum + num > query) {
                    break;
                }
                sum += num;
                size++;
            }
            answer[i] = size;
        }
        return answer;
    }

    public ListNode middleNode(ListNode head) {
        // 经典算法
//        ListNode q = head, p = head;
//        int sum = 0;
//        while (q != null) {
//            sum++;
//            q = q.next;
//        }
//        for (int i = 1; i < (sum/2 + 1); i++ ) {
//            p = p.next;
//        }
//        return p;

        // 快慢指针
        ListNode q = head, p = head;
        while (q != null && q.next != null) {
            q = q.next.next;
            p = p.next;
        }
        return p;
    }

    /**
     * 383. 赎金信
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     * 如果可以，返回 true ；否则返回 false 。
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineCharArray = magazine.toCharArray();
        int[] ints = new int[magazineCharArray.length];
        for (char c : ransomNote.toCharArray()) {
            int i;
            for (i = 0; i < magazineCharArray.length; i++) {
                if (c == magazineCharArray[i] && ints[i] == 0) {
                    ints[i]++;
                    break;
                }
            }
            if (i == magazineCharArray.length) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        Solution solution = new Solution();
        solution.canConstruct(ransomNote, magazine);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
