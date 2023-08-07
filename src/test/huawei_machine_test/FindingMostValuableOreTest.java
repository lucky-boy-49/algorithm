package test.huawei_machine_test;

import main.huawei_machine_test.FindingMostValuableOre;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Scanner;

class FindingMostValuableOreTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        int m = list.size();
        int n = list.get(0).toCharArray().length;
        int[][] ints = new int[m][n];
        for (int i = 0; i < m; i++) {
            char[] charArray = list.get(i).toCharArray();
            for (int j = 0; j < n; j++) {
                ints[i][j] = Integer.parseInt(String.valueOf(charArray[j]));
            }
        }
        FindingMostValuableOre.solution(ints);
    }
}