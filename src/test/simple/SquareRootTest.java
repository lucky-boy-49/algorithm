package test.simple;

import main.simple.SquareRoot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void binarySearch() {
        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.binarySearch(25));
    }

    @Test
    void newTon() {
        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.newTon(25));
    }
}