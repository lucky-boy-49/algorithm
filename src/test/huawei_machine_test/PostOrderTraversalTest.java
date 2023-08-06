package test.huawei_machine_test;

import main.huawei_machine_test.PostOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class PostOrderTraversalTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        PostOrderTraversal.solution(line);
    }
}