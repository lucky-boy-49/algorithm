package main.huawei_machine_test;

import java.util.LinkedList;
import java.util.List;

/**
 * 不等式
 * 题目描述
 * 给定一组不等式，判断是否成立并输出不等式的最大差（输出浮点数的整数部分）
 * 要求：
 * 不等式系数为double类型，是一个二维数组
 * 不等式的变量为int类型，是一维数组
 * 不等式的目标值为double类型，是一维数组
 * 不等式约束为字符串数组，只能是大于，大于等于，小于，小于等于，等于
 * 例如：不等式组：
 * a11*x1+a12*x2+a13*x3+a14*x4+a15*x5<=b1;
 * a21*x1+a22*x2+a23*x3+a24*x4+a25*x5<=b2;
 * a31*x1+a32*x2+a33*x3+a34*x4+a35*x5<=b3;
 * 最大差 = max{
 * (a11*x1+a12*x2+a13*x3+a14*x4+a15*x5-b1),
 * (a21*x1+a22*x2+a23*x3+a24*x4+a25*x5-b2),
 * (a31*x1+a32*x2+a33*x3+a34*x4+a35*x5-b3)
 * },
 * 类型为整数(输出浮点数的整数部分)
 * 输入描述
 * 不等式组系数（double类型）
 * a11,a12,a13,a14,a15
 * a21,a22,a23,a24,a25
 * a31,a32,a33,a34,a35
 * 不等式变量（int类型）
 * x1,x2,x3,x4,x5
 * 不等式目标值（double类型）
 * b1,b2,b3
 * 不等式约束（字符串类型）
 * <=,<=,<=
 * 输入:
 * a11,a12,a13,a14,a15;a21,a22,a23,a24,a25;a31,a32,a33,a34,a35;x1,x2,x3,x4,x5;b1,b2,b3;<=,<=,<=
 * 输出描述
 * true或者false,最大差
 */
public class Inequality {

    public static void solution(String line) {

        String[] split = line.split(";");
        boolean right = true;
        List<Integer> list = new LinkedList<>();

        String[] limits = split[split.length - 1].split(",");
        String[] aims = split[split.length - 2].split(",");
        String[] vars = split[split.length - 3].split(",");

        for (int i = 0; i < limits.length; i++) {
            double value = 0;
            double aim = Double.parseDouble(aims[i]);

            String[] split1 = split[i].split(",");
            for (int j = 0; j < split1.length; j++) {
                value += Double.parseDouble(split1[j]) * Integer.parseInt(vars[j]);
            }
            String limit = limits[i];
            int e = Double.valueOf(Math.abs(value - aim)).intValue();
            switch (limit) {
                case ">" -> {
                    right = (value > aim) && right;
                    list.add(e);
                }
                case "<" -> {
                    right = (value < aim) && right;
                    list.add(e);
                }
                case ">=" -> {
                    right = (value >= aim) && right;
                    list.add(e);
                }
                case "<=" -> {
                    right = (value <= aim) && right;
                    list.add(e);
                }
                default -> right = false;
            }
        }

        System.out.print(right + " ");
        if (list.stream().max(Integer::compareTo).isPresent()) {
            System.out.println(list.stream().max(Integer::compareTo).get());
        } else {
            System.out.println("-1");
        }

    }

}
