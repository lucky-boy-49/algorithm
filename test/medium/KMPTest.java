package medium;

import main.medium.KMP;
import org.junit.jupiter.api.Test;

class KMPTest {

    @Test
    void KMP() {
        KMP kmp = new KMP();
        int kmp1 = kmp.search(new char[]{'a', 'c', 'd', 'e', 'g', 'g'}, new char[]{'e', 'g', 'g'});
        System.out.println(kmp1);
    }

    @Test
    void indexOf() {
        KMP kmp = new KMP();
        System.out.println(kmp.indexOf("WWE QWERQW QWERQWERQWRT", "QWERQWR"));
    }
}