package main.huawei_machine_test;

/**
 * IPv4地址转换成整数
 * 题目描述
 * 存在一种虚拟IPv4地址，由4小节组成，每节的范围为0~255，以#号间隔，
 * 虚拟IPv4地址可以转换为一个32位的整数，例如：
 * 128#0#255#255，转换为32位整数的结果为2147549183（0x8000FFFF）
 * 1#0#0#0，转换为32位整数的结果为16777216（0x01000000）
 * 现以字符串形式给出一个虚拟IPv4地址，限制第1小节的范围为1~128，
 * 即每一节范围分别为(1~128)#(0~255)#(0~255)#(0~255)，
 * 要求每个IPv4地址只能对应到唯一的整数上。
 * 如果是非法IPv4，返回invalid IP
 * 备注：
 * 输入不能确保是合法的IPv4地址，
 * 需要对非法IPv4（空串，含有IP地址中不存在的字符，
 * 非合法的#分十进制，十进制整数不在合法区间内）进行识别，返回特定错误
 * 输入描述
 * 输入一行，虚拟IPv4地址格式字符串
 * 输出描述
 * 输出以上，按照要求输出整型或者特定字符
 */
public class ConvertIPv4AddressToInteger {

    public static void solution(String line) {

        String[] strings = line.split("#");
        int len = strings.length;
        long count = 0;
        boolean isF = true;

        if (len == 4) {
            for (int i = 0; i < len; i++) {
                long n = Integer.parseInt(strings[i]);
                if (i == 0 && (n < 1 || n > 128)) {
                    isF = false;
                    break;
                } else if (n < 0 || n > 255) {
                    isF = false;
                    break;
                }
                count += n << (8 * (3 - i));
            }
        } else {
            isF = false;
        }

        if (isF) {
            System.out.print(count);
        } else {
            System.out.print("invalid IP");
        }

    }

}
