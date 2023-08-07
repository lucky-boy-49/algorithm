package test.huawei_machine_test;

import main.huawei_machine_test.StackBooks;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StackBooksTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StackBooks.solution(input);
    }
}