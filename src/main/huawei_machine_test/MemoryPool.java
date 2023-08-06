package main.huawei_machine_test;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * 内存池
 * 题目描述
 * 有一个简易内存池，内存按照大小粒度分类，每个粒度有若干个可用内存资源。
 * 用户会进行一系列内存申请，需要按需分配内存池中的资源，返回申请结果成功失败列表。
 * 分配规则如下：
 * 分配的内存要大于等于内存的申请量
 * 存在满足需求的内存就必须分配
 * 优先分配粒度小的，但内存不能拆分使用
 * 需要按申请顺序分配
 * 先申请的先分配，有可用内存分配则申请结果为true
 * 没有可用则返回false
 * 注释：不考虑内存释放
 * 输入描述
 * 输入为两行字符串:
 * 第一行为内存池资源列表，
 * 包含内存粒度数据信息，粒度数据间用逗号分割，
 * 一个粒度信息内用冒号分割，冒号前为内存粒度大小，冒号后为数量，
 * 资源列表不大于1024
 * 每个粒度的数量不大于4096
 * 第二行为申请列表，
 * 申请的内存大小间用逗号分割，申请列表不大于100000
 * 如
 * 64:2,128:1,32:4,1:128
 * 50,36,64,128,127
 * 输出描述
 * 输出为内存池分配结果
 * 如true,true,true,false,false
 */
public class MemoryPool {

    public static void solution(String m, String apply) {
        LinkedList<int[]> mList = new LinkedList<>();
        for (String s : m.split(",")) {
            String[] split = s.split(":");
            mList.add(new int[]{
                    Integer.parseInt(split[0]),
                    Integer.parseInt(split[1])
            });
        }
        mList.sort(Comparator.comparingInt(v -> v[0]));
        String[] applies = apply.split(",");
        StringBuilder res = new StringBuilder();
        for (String key : applies) {
            int i;
            for (i = 0; i < mList.size(); i++) {
                int[] ints = mList.get(i);
                if (ints[0] > Integer.parseInt(key)) {
                    if (ints[1] != 0) {
                        ints[1] -= 1;
                        res.append("true,");
                        break;
                    }
                }
            }
            if (i == mList.size()) {
                res.append("false,");
            }
        }
        System.out.println(res.substring(0, res.length() - 1));
    }

}
