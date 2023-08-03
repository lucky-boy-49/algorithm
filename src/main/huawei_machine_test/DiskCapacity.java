package main.huawei_machine_test;

import java.util.Arrays;
import java.util.List;

/**
 * 磁盘容量
 * 题目描述
 * 磁盘的容量单位常用的有M、G、T
 * 他们之间的换算关系为1T =1024G，1G=1024M
 * 现在给定n块磁盘的容量，请对他们按从小到大的顺序进行稳定排序
 * 例如给定5块盘的容量
 * 5
 * 1T
 * 20M
 * 3G
 * 10G6T
 * 3M12G9M
 * 排序后的结果为
 * 20M
 * 3G
 * 3M12G9M
 * 1T
 * 10G6T
 * 注意单位可以重复出现
 * 上述3M12G9M表示的容量即为3M12G9M和12M12G相等
 * 输入描述
 * 输入第一行包含一个整数n，2 <= n<= 100，表示磁盘的个数。
 * 接下来的n行，每行一个字符串，2 < 长度 < 30，表示磁盘的容量，
 * 由一个或多个格式为MV的子串组成，其中M表示容量大小，V表示容量单位，
 * 例如20M、1T。
 * 磁盘容量的范围1 ~ 1024的正整数，单位M、G、T。
 * 输出描述
 * 输出n行
 * 表示n块磁盘容量排序后的结果
 */
public class DiskCapacity {

    public static void solution(String[] line) {
        List<String> collect = Arrays.stream(line).sorted((s1, s2) -> {
            long size1 = size(s1);
            long size2 = size(s2);
            if (size1 == size2) {
                return 0;
            }
            return Math.toIntExact(size1 - size2);
        }).toList();
        collect.forEach(System.out::println);
    }

    private static long size(String disk) {
        long size = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < disk.length(); i++) {
            String indent = String.valueOf(disk.charAt(i));
            switch (indent) {
                case "M" -> {
                    size += Long.parseLong(builder.toString());
                    builder = new StringBuilder();
                }
                case "G" -> {
                    size += (Long.parseLong(builder.toString()) * 1024);
                    builder = new StringBuilder();
                }
                case "T" -> {
                    size += (Long.parseLong(builder.toString()) * 1024 * 1024);
                    builder = new StringBuilder();
                }
                default -> builder.append(indent);
            }
        }
        return size;
    }

}
