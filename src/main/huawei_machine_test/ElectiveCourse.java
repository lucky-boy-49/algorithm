package main.huawei_machine_test;

import java.util.*;

/**
 * 题目0250-选修课
 * 现有两门选修课，每门选修课都有一部分学生选修，每个学生都有选修课的成绩，需要你找出同时选修了两门选修课的学生，先按照班级进行划分，班级编号小的先输出，每个班级按照两门选修课成绩和的降序排序，成绩相同时按照学生的学号升序排序。
 * 第一行为第一门选修课学生的成绩，
 * 第二行为第二门选修课学生的成绩，
 * 每行数据中学生之间以英文分号分隔，每个学生的学号和成绩以英文逗号分隔，
 * 学生学号的格式为8位数字
 * 2位院系编号+入学年份后2位+院系内部1位专业编号+所在班级3位学号
 * 学生成绩的取值范围为[0,100]之间的整数，
 * 两门选修课选修学生数的取值范围为[1-2000]之间的整数。
 * 同时选修了两门选修课的学生的学号，如果没有同时选修两门选修课的学生输出NULL，
 * 否则，先按照班级划分，班级编号小的先输出，每个班级先输出班级编号(学号前五位)，
 * 然后另起一行输出这个班级同时选修两门选修课的学生学号，学号按照要求排序(按照两门选修课成绩和的降序，成绩和相同时按照学号升序学生之间以英文分号分隔。
 */
public class ElectiveCourse {

    public static void solution(String[] course1, String[] course2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : course1) {
            String[] split = s.split(",");
            map1.put(split[0], Integer.valueOf(split[1]));
        }
        for (String s : course2) {
            String[] split = s.split(",");
            map2.put(split[0], Integer.valueOf(split[1]));
        }

        Map<String, List<Student>> classMap = new TreeMap<>();

        for (String id : map1.keySet()) {
            if (map2.containsKey(id)) {
                String classId = id.substring(0, 5);
                classMap.putIfAbsent(classId, new ArrayList<>());
                classMap.get(classId).add(new Student(id, map1.get(id) + map2.get(id)));
            }
        }

        if (classMap.isEmpty()) {
            System.out.println("NULL");
            return;
        }

        classMap.forEach((classId, students) -> {
            students.sort((s1, s2) -> s2.totalScore != s1.totalScore ? s2.totalScore - s1.totalScore : s1.id.compareTo(s2.id));
            System.out.println(classId);
            for (int i = 0; i < students.size(); i++) {
                if (i != students.size() - 1) {
                    System.out.print(students.get(i).id + ";");
                } else {
                    System.out.println(students.get(i).id);
                }
            }
        });

    }


}

class Student {
    String id;
    int totalScore;

    public Student(String id, int totalScore) {
        this.id = id;
        this.totalScore = totalScore;
    }

}