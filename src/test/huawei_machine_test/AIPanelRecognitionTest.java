package test.huawei_machine_test;

import main.huawei_machine_test.AIPanelRecognition;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class AIPanelRecognitionTest {

    @Test
    void solution() {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] lights = new String[num];
        for (int i = 0; i < num; i++) {
            lights[i] = sc.nextLine();
        }
        AIPanelRecognition.solution(lights);
    }
}