package main.huawei_machine_test;

/**
 * 题目0048-分糖果
 * 小明从糖果盒中随意抓一把糖果
 * 每次小明会取出一半的糖果分给同学们
 * 当糖果不能平均分配时
 * 小明可以从糖果盒中(假设盒中糖果足够)取出一个或放回一个糖果
 * 小明至少需要多少次(取出放回和平均分配均记一次)能将手中糖果分至只剩一颗
 */
public class DivideCandy {

    public void solution(int candy) {

        int res = 0;

        if (candy % 2 != 0) {
            candy++;
            res++;
        }

        double log = Math.log(candy) / Math.log(2);

        if (log > 0) {
            res = (int) (res + log);
        }

        System.out.println(res);
    }

}
