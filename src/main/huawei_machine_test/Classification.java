package main.huawei_machine_test;

import java.util.Objects;
import java.util.TreeSet;

/**
 * 找出同班小朋友
 * 题目描述
 * 幼儿园两个班的小朋友排队时混在了一起
 * 每个小朋友都知道自己跟前面一个小朋友是不是同班
 * 请你帮忙把同班的小朋友找出来
 * 小朋友的编号为整数
 * 与前面一个小朋友同班用Y表示
 * 不同班用N表示
 * 输入描述
 * 输入为空格分开的小朋友编号和是否同班标志
 * 比如 6/N 2/Y 3/N 4/Y
 * 表示一共有4位小朋友
 * 2和6是同班，3和2不同班，4和3同班
 * 小朋友总数不超过999
 * 0 < 每个小朋友编号 < 999
 * 不考虑输入格式错误
 * 输出描述
 * 每一行记录一班小朋友的编号 编号用空格分开
 * 并且
 * 编号需要按照大小升序排列，分班记录中第一个编号小的排在第一行
 * 如果只有一个班的小朋友 第二行为空
 * 如果输入不符合要求输出字符串ERROR
 */
public class Classification {

    public static void solution(String line) {
        String[] split = line.split(" ");
        try {
            TreeSet<Integer> class1 = new TreeSet<>();
            TreeSet<Integer> class2 = new TreeSet<>();

            String[] student1 = split[0].split("/");
            int student1_id = Integer.parseInt(student1[0]);

            class1.add(student1_id);

            int temp = 1;
            for (int i = 1; i < split.length; i++) {
                String[] student2 = split[i].split("/");
                Integer student2_id = Integer.valueOf(student2[0]);
                String student2_temp = student2[1];

                if (Objects.equals(student2_temp, "Y")) {
                    if (temp == 1) {
                        class1.add(student2_id);
                    } else {
                        class2.add(student2_id);
                    }
                } else {
                    if (temp == 1) {
                        class2.add(student2_id);
                        temp = 2;
                    } else {
                        class1.add(student2_id);
                        temp = 1;
                    }
                }
            }

            StringBuilder b1 = new StringBuilder();
            class1.forEach(s -> {
                b1.append(s).append(" ");
            });

            if (!class2.isEmpty()) {
                StringBuilder b2 = new StringBuilder();
                class2.forEach(s -> {
                    b2.append(s).append(" ");
                });
                if (class1.first() < class2.first()) {
                    System.out.println(b1.toString().trim());
                    System.out.println(b2.toString().trim());
                } else {
                    System.out.println(b2.toString().trim());
                    System.out.println(b1.toString().trim());
                }
            } else {
                System.out.println(b1.toString().trim());
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }

    }

}
