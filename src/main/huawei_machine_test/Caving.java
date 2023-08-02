package main.huawei_machine_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 洞穴探险
 * 题目描述
 * 某探险队负责对地下洞穴进行探险,
 * 探险队成员在进行探险任务时,随身携带的记录器会不定期的记录自身的坐标
 * 但在记录的间隙中也会记录其他数据,
 * 探索工作结束,后探险队需要获取到 某成员在探险过程中,
 * 相对于探险队总部的最远的足迹位置。
 * 仪器记录坐标时,坐标的数据格式(x,y),如(1,2),(100,200)
 * 其中0 < x < 1000,0 < y < 1000,同时存在非法坐标如(01,1),(1,01),(0,100)属于非法坐标.
 * 设定探险队总部的坐标为(0,0)某位置相对总部的距离为x*x+y*y。
 * 若两个坐标的相对总部的距离相同则第一次到达的坐标为最远的足迹
 * 若记录仪中的坐标都不合法输出总部坐标(0,0)
 * 备注：不需要考虑双层括号嵌套的情况比如sfsdfsd((1,2))
 * 输入描述
 * 字符串表示记录仪中的数据如:
 * ferga13fdsf3(100,200)f2r3rfasf(300,400)
 * 输出描述
 * 字符串表示最远足迹到达的坐标如:
 * (300,400)
 */
public class Caving {

    public static void solution(String line) {
        Pattern compile = Pattern.compile("\\([^)]+\\)");
        Matcher matcher = compile.matcher(line);
        int resNub = 0;
        String resStr = "(0,0)";
        outer:
        while (matcher.find()) {
            String s = matcher.group();
            s = s.substring(1, s.length() - 1);
            int x = 0, y = 0;
            String[] split = s.split(",");
            for (int i = 0; i < split.length; i++) {
                if (Integer.parseInt(String.valueOf(split[0].charAt(0))) == 0) {
                    continue outer;
                }
                if (i == 0) {
                    x = Integer.parseInt(split[i]);
                    if (x <= 0 || x >= 1000) {
                        continue outer;
                    }
                } else {
                    y = Integer.parseInt(split[i]);
                    if (y <= 0 || y >= 1000) {
                        continue outer;
                    }
                }
            }
            int cur = x * x + y * y;
            if (cur > resNub) {
                resNub = cur;
                resStr = "(" + x + "," + y + ")";
            }
        }
        System.out.println(resStr);
    }

    public static void solution2(String line) {
        int index = 0, x = 0, y = 0, max = 0;
        int l, r;

        while (true) {
            line = line.substring(index);
            l = line.indexOf("(");
            r = line.indexOf(")");

            if (l == -1) break;

            String substring = line.substring(l + 1, r);
            String[] split = substring.split(",");

            if (!split[0].startsWith("0") && !split[1].startsWith("0")) {
                int a = Integer.parseInt(split[0]);
                int b = Integer.parseInt(split[1]);
                int len = a * a + b * b;
                if (max < len) {
                    max = len;
                    x = a;
                    y = b;
                }
            }
            index = r + 1;
        }
        System.out.printf("(%d,%d)", x, y);
    }

}
