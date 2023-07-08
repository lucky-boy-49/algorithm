package main.simple;


/**
 * @author HJ
 * 189. 轮转数组
 */
public class RotationArray {

    public void rotate(int[] nums, int k) {
        // 第一种 使用额外的数组
        int n = nums.length;
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++) {
          newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);

        // 第二种 环状替换
        k = k%n;
        int count = gcd(k, n);
        for (int start = 0; start < count; ++start) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }

        // 数组翻转
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, (k % nums.length) - 1);
        reverse(nums, k % nums.length, nums.length - 1);

    }

    /**
     * 最大公约数
     */
    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x%y) : x;
    }

    /**
     * 翻转数组,下标start开始到下标end结束
     */
    private void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args){
        RotationArray rotationArray = new RotationArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotationArray.rotate(nums, k);
    }

}