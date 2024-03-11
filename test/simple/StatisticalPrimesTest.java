package simple;

import main.simple.StatisticalPrimes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticalPrimesTest {

    @org.junit.jupiter.api.Test
    void violence() {
        StatisticalPrimes statisticalPrimes = new StatisticalPrimes();
        System.out.println(statisticalPrimes.violence(101));
    }

    @Test
    void eratosthenes() {
        StatisticalPrimes statisticalPrimes = new StatisticalPrimes();
        System.out.println(statisticalPrimes.eratosthenes(101));
    }
}