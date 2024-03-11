package huawei_machine_test;

import main.huawei_machine_test.FindWords;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

class FindWordsTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            matrix[i] = scanner.nextLine()
                    .replaceAll(",", "")
                    .toCharArray();
        }
        String word = scanner.nextLine();
        scanner.close();
        List<String> res = FindWords.solution(matrix, word);
        if (!res.isEmpty()) {
            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.print(res.get(i));
                if (i != 0) {
                    System.out.print(",");
                }
            }
        } else {
            System.out.println("N");
        }

    }
}