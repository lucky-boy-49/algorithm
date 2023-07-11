package test.medium;

import main.medium.KMP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KMPTest {

    @Test
    void KMP() {
        KMP kmp = new KMP();
        int kmp1 = kmp.search(new char[]{'a', 'c', 'd', 'e', 'g', 'g'}, new char[]{'e', 'g', 'g'});
        System.out.println(kmp1);
    }
}