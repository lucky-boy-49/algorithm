package simple;

import main.simple.CapitalizeTheTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTheTitleTest {

    @Test
    void capitalizeTitle() {
        CapitalizeTheTitle capitalizeTheTitle = new CapitalizeTheTitle();
        System.out.println(capitalizeTheTitle.capitalizeTitle("First leTTeR of EACH Word"));
    }

    @Test
    void capitalizeTitleTwo() {
        CapitalizeTheTitle capitalizeTheTitle = new CapitalizeTheTitle();
        System.out.println(capitalizeTheTitle.capitalizeTitleTwo("First leTTeR of EACH Word"));
    }
}