package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0013-航天器
 * 给航天器一侧加装长方形和正方形的太阳能板(图中的斜线区域);
 * 需要先安装两个支柱(图中的黑色竖条);
 * 再在支柱的中间部分固定太阳能板;
 * 但航天器不同位置的支柱长度不同;
 * 太阳能板的安装面积受限于最短一侧的那支支柱的长度;
 * 现提供一组整型数组的支柱高度数据;
 * 假设每个支柱间的距离相等为一个单位长度;
 * 计算如何选择两根支柱可以使太阳能板的面积最大;
 */
public class Spacecraft {

    public void spacecraft(String line) {
        String[] split = line.split(",");

        long[] longs = Arrays.stream(split).mapToLong(Long::parseLong).toArray();

        long max = 0;

        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                long area = Math.min(longs[i], longs[j]) * (j - i);
                max = Math.max(max, area);
            }
        }

        System.out.println(max);

    }

}
