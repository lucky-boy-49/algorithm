package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 服务失效判断
 * 服务依赖
 * 题目描述
 * 在某系统中有众多服务，每个服务用字符串（只包含字母和数字，长度<=10）唯一标识，服务间可能有依赖关系，如A依赖B，则当B故障时导致A也故障。
 * 传递具有依赖性，如A依赖B，B依赖C，当C故障时导致B故障，也导致A故障。给出所有依赖关系以及当前已知故障服务，要求输出所有正常服务。
 * 依赖关系：服务1-服务2表示“服务1依赖服务2”不必考虑输入异常
 * 输入描述
 * 半角逗号分隔的依赖关系列表（换行）
 * 半角逗号分割的故障服务列表
 * 输出描述
 * 依赖关系列表中提及的所有服务中可以正常工作的服务列表用半角逗号分隔，
 * 按依赖关系列表中出现的次序排序。特别的，没有正常节点输出单独一个半角逗号。
 */
public class ServiceFailureJudgment {

    public static void solution(String servers, String bad) {
        List<String[]> list = new ArrayList<>();
        List<String> listS = new ArrayList<>();
        List<String> badList = Arrays.asList(bad.split(","));
        for (String string : servers.split(",")) {
            list.add(string.split("-"));
            String a = string.split("-")[0];
            String b = string.split("-")[1];
            if (!listS.contains(a)) {
                listS.add(a);
            }
            if (!listS.contains(b)) {
                listS.add(b);
            }
        }
        for (String s : badList) {
            listS.remove(s);
        }
        List<String> normalList = new ArrayList<>();

        for (String x : listS) {
            if (!broken(list, x, badList)) {
                normalList.add(x);
            }
        }
        int len = normalList.size();
        if (len == 0) {
            System.out.println(",");
        } else {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < len; i++) {
                res.append(normalList.get(i));
                if (i != len - 1) {
                    res.append(",");
                }
            }
            System.out.println(res);
        }
    }

    private static boolean broken(List<String[]> l, String s, List<String> badList) {
        if (badList.contains(s)) {
            return true;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[0].equals(s) && broken(l, l.get(i)[1], badList)) {
                return true;
            }
        }
        return false;
    }

}
