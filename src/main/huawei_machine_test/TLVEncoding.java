package main.huawei_machine_test;

/**
 * TLV编码
 * 题目描述
 * TLV编码是按TagLengthValue格式进行编码的。
 * 一段码流中的信元用tag标识，tag在码流中唯一不重复，
 * length表示信元value的长度，value表示信元的值，
 * 码流以某信元的tag开头，tag固定占一个字节，length固定占两个字节，字节序为小端序。
 * 现给定tlv格式编码的码流以及需要解码的信元tag，请输出该信元的value。
 * 输入码流的十六进制字符中，不包括小写字母；
 * 且要求输出的十六进制字符串中也不要包含小写字母；
 * 码流字符串的最大长度不超过50000个字节。
 * 输入描述
 * 第一行为一个字符串 ，表示待解码信元的tag；
 * 第二行为一个字符串， 表示待解码的十六进制码流；
 * 字节之间用空格分割。
 * 输出描述
 * 输出一个字符串，表示待解码信元以十六进制表示的value。
 */
public class TLVEncoding {

    public static void solution(String tag, String codes) {
        int p = 0;
        while (p < codes.length()) {
            String curTag = codes.substring(p, p + 2);
            String lenHEX = codes.substring(p + 6, p + 8) + codes.substring(p + 3, p + 5);
            int lenDEC = Integer.parseInt(lenHEX, 16);
            if (tag.equals(curTag)) {
                String value = codes.substring(p + 9, p + 9 + lenDEC * 3);
                System.out.println(value);
            }
            p += 9 + lenDEC * 3;
        }
    }

}
