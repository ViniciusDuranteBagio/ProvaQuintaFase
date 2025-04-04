package org.example;

import classes.Caixa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaTest {

    @Test
    public void testCalcularSalario() {
        Caixa caixa = new Caixa("José", 1500.0);
        caixa.calcularSalario();
        assertEquals(1500.0, caixa.getSalario(), 0.01);
    }

    @Test
    public void testValorNegativoSalarioFixo() {
        Caixa caixa = new Caixa("José", -1500.0);
        caixa.calcularSalario();
        assertEquals(0.0, caixa.getSalario(), 0.01);
    }
}
