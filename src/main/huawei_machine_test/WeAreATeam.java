package main.huawei_machine_test;

import java.util.LinkedList;

/**
 * we are a team
 */
public class WeAreATeam {

    public static void solution(String[] line, int n) {
        LinkedList<String> list = new LinkedList<>();
        for (String s : line) {
            String[] split = s.split(" ");
            if (Integer.parseInt(split[2]) == 0) {
                String str = split[0] + " " + split[1];
                list.add(str);
            } else if (Integer.parseInt(split[2]) == 1) {
                String str = split[0] + " " + split[1];
                int v1 = Integer.parseInt(split[0]);
                int v2 = Integer.parseInt(split[1]);
                if (v1 < 1 || v1 > n || v2 < 1 || v2 > n) {
                    System.out.println("da pian zi");
                    continue;
                }
                if (list.contains(str)) {
                    System.out.println("we are a team");
                } else {
                    System.out.println("we are not a team");
                }
            } else {
                System.out.println("da pian zi");
            }
        }
    }

}
