package test.huawei_machine_test;

import main.huawei_machine_test.PlanetTerraform;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Scanner;

class PlanetTerraformTest {

    @Test
    void solution() {
        LinkedList<String[]> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            String[] split = s.split(" ");
            list.add(split);
        }
        int size = list.size();
        String[][] strings = new String[size][list.get(0).length];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, strings[i], 0, list.get(0).length);
        }
        PlanetTerraform.solution(strings);
    }
}