package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni
        String jmenoTest = "[Hedvika, Hedvig]";
        String vysledek = new SvatkySluzba().vyhledatSvatkyKeDni(MonthDay.of(10, 17)).toString();
        assertEquals(jmenoTest, vysledek);

    }
    @Test
    void vyhledatSvatkyKeDniPrazdny() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni
        String jmenoTest = "[]";
        String vysledek = new SvatkySluzba().vyhledatSvatkyKeDni(MonthDay.of(1, 1)).toString();
        assertEquals(jmenoTest, vysledek);

    }
}








