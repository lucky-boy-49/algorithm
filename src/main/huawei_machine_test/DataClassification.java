package main.huawei_machine_test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据分类
 * 题目描述
 * 对一个数据a进行分类，
 * 分类方法是，此数据a(4个字节大小)的4个字节相加对一个给定值b取模，
 * 如果得到的结果小于一个给定的值c则数据a为有效类型，其类型为取模的值。
 * 如果得到的结果大于或者等于c则数据a为无效类型。
 * 比如一个数据a = 0x01010101，b = 3
 * 按照分类方法计算：(0x01 + 0x01 + 0x01 + 0x01) % 3 = 1
 * 所以如果c等于2，则此a就是有效类型，其类型为1
 * 如果c等于1，则此a是无效类型
 * 又比如一个数据a = 0x01010103，b = 3
 * 按分类方法计算：(0x01 + 0x01 + 0x01 + 0x03) % 3 = 0
 * 所以如果c = 2则此a就是有效类型，其类型为0
 * 如果c = 0则此a是无效类型
 * 输入12个数据，
 * 第一个数据为c，第二个数据为b，
 * 剩余10个数据为需要分类的数据
 * 请找到有效类型中包含数据最多的类型，
 * 并输出该类型含有多少个数据
 * 输入描述
 * 输入12个数据用空格分割，
 * 第一个数据为c，第二个数据为b，
 * 剩余10个数据为需要分类的数据。
 * 输出描述
 * 请找到有效类型中包含数据最多的类型，
 * 并输出该类型含有多少个数据。
 */
public class DataClassification {

    public static void solution(int c, int b, int[] dataArgs) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : dataArgs) {
            int byte1 = (data >> 24) & 0xFF;
            int byte2 = (data >> 16) & 0xFF;
            int byte3 = (data >> 8) & 0xFF;
            int byte4 = data & 0xFF;
            int curC = (byte1 + byte2 + byte3 + byte4) % b;
            if (curC < c) {
                if (map.containsKey(curC)) {
                    map.put(curC, map.get(curC) + 1);
                } else {
                    map.put(curC, 1);
                }
            }
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted((e1, e2) -> {
            return e2.getValue() - e1.getValue();
        }).toList();
        System.out.println(list.get(0).getValue());
    }

}
