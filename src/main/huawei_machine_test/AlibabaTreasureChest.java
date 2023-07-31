package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 阿里巴巴找黄金宝箱 I
 * 一贫如洗的樵夫阿里巴巴在去砍柴的路上，无意中发现了强盗集团的藏宝地，藏宝地有编号从0~N的箱子，每个箱子上面贴有一个数字，箱子中可能有一个黄金宝箱。
 * 黄金宝箱满足排在它之前的所有箱子数字和等于排在它之后的所有箱子数字和;第一个箱子左边部分的数字和定义为0;最后一个宝箱右边部分的数字和定义为0。
 * 请帮阿里巴巴找到黄金宝箱，输出第一个满足条件的黄金宝箱编号，如果不存在黄金宝箱，请返回-1.
 */
public class AlibabaTreasureChest {

    public static int solution(String line) {
        String[] split = line.split(",");
        long leftSum = Arrays.stream(split).mapToLong(Long::parseLong).sum();
        long rightSum = 0;
        for (int i = 0; i < split.length; i++) {
            if (rightSum == leftSum - Integer.parseInt(split[i])) {
                return i;
            } else {
                rightSum += Integer.parseInt(split[i]);
                leftSum -= Integer.parseInt(split[i]);
            }
        }
        return -1;
    }

}
