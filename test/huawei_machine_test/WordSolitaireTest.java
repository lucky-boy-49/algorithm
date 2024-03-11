package huawei_machine_test;

import main.huawei_machine_test.WordSolitaire;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

class WordSolitaireTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(scanner.nextLine());
        }
        WordSolitaire.solution(k, words);
    }
}