package medium;

/**
 * 1689. 十-二进制数的最少数目
 * @packageName medium
 * @ClassName PartitioningIntoMinimumNumberOfDeciBinaryNumbers
 * @author HJ
 * @date 2023/3/28 21:55
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int maxDigit = 0;
        int length = n.length();
        for (int i = 0; i < length; i++) {
            int digit = n.charAt(i) - '0';
            maxDigit = Math.max(maxDigit, digit);
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers numbers = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        String n = "32";
        System.out.println(numbers.minPartitions(n));
    }

}
