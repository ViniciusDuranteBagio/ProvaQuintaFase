package org.example;

import classes.Faxineiro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaxineiroTest {

    @Test
    public void testCalcularSalario() {
        Faxineiro faxineiro = new Faxineiro("Ana", 1200.0, 50.0, 5);
        faxineiro.calcularSalario();
        assertEquals(1400.0, faxineiro.getSalario(), 0.01);
    }

    @Test
    public void testValorNegativoBonusTurno() {
        Faxineiro faxineiro = new Faxineiro("Ana", 1200.0, -50.0, 5);
        faxineiro.calcularSalario();
        assertEquals(1200.0, faxineiro.getSalario(), 0.01);
    }
}
