package main.huawei_machine_test;

/**
 * 数列还原
 * 题目描述
 * 有一个数列A[n]
 * 从A[0]开始每一项都是一个数字
 * 数列中A[n+1]都是A[n]的描述
 * 其中A[0]=1
 * 规则如下
 * A[0]:1
 * A[1]:11 含义其中A[0]=1是1个1 即11
 * 表示A[0]从左到右连续出现了1次1
 * A[2]:21 含义其中A[1]=11是2个1 即21
 * 表示A[1]从左到右连续出现了2次1
 * A[3]:1211 含义其中A[2]从左到右是由一个2和一个1组成 即1211
 * 表示A[2]从左到右连续出现了一次2又连续出现了一次1
 * A[4]:111221 含义A[3]=1211 从左到右是由一个1和一个2两个1 即111221
 * 表示A[3]从左到右连续出现了一次1又连续出现了一次2又连续出现了2次1
 * 输出第n项的结果
 * 输入描述
 * 数列第n项
 * 0 <= n <= 59
 * 输出描述
 * 数列内容
 */
public class SequenceReduction {

    public static void solution(int n) {
        if (n < 0) {
            return;
        }
        if (n == 1) {
            System.out.println("11");
        }
        String res = "11";
        for (int i = 2; i <= n; i++) {
            char[] charArray = res.toCharArray();
            StringBuilder builder = new StringBuilder();
            char curChar = charArray[0];
            int curNum = 1;
            int length = charArray.length;
            for (int j = 1; j < length; j++) {
                if (curChar == charArray[j] && j != length - 1) {
                    curNum++;
                }
                if (curChar == charArray[j] && j == length - 1) {
                    builder.append(curNum + 1).append(curChar);
                } else {
                    builder.append(curNum).append(curChar);
                }
                curChar = charArray[j];
                curNum = 1;
            }
            if (charArray[length - 1] != charArray[length - 2]) {
                builder.append(1).append(charArray[length - 1]);
            }
            res = builder.toString();
        }
        System.out.println(res);
    }

}
