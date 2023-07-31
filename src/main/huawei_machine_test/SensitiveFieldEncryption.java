package main.huawei_machine_test;

import java.util.LinkedList;
import java.util.List;

/**
 * 题目0082-敏感字段加密
 * 给定一个由多个命令字组成的命令字符串；
 * 字符串长度小于等于127个字节，只包含大小写字母，数字，下划线和偶数个双引号
 * 命令字之间以一个或多个下划线_进行分割
 * 可以通过两个双引号""来标识包含下划线_的命令字或空命令字(仅包含两个双引号的命令字)，双引号不会在命令字内部出现
 * 请对指定索引的敏感字段进行加密，替换为******(6个*)，
 * 并删除命令字前后多余的下划线_。
 * 如果无法找到指定索引的命令字，输出字符串ERROR
 */
public class SensitiveFieldEncryption {

    public static String solution(int k, String s) {

        List<String> strings = new LinkedList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            String str = "";
            if (c == '"') {
                int index = s.indexOf('"', i + 1);
                str = s.substring(i, index + 1);
                i = index + 1;
            } else {
                int index2 = s.indexOf('_', i);
                if (index2 != -1) {
                    str = s.substring(i, index2);
                    i = index2;
                } else {
                    str = s.substring(i);
                    i = s.length();
                }
            }
            if (!str.isEmpty()) {
                strings.add(str);
            }
        }

        if (k < strings.size()) {
            strings.set(k, "******");
            StringBuffer res = new StringBuffer();
            strings.forEach(x -> res.append(x).append("_"));
            return res.substring(0, res.length() - 1);
        } else {
            return "ERROR";
        }

    }

}
