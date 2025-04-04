package org.example;

import classes.Seguranca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegurancaTest {

    @Test
    public void testCalcularSalario() {
        Seguranca seguranca = new Seguranca("Roberto", 1500.0, 200.0);
        seguranca.calcularSalario();
        assertEquals(1700.0, seguranca.getSalario(), 0.01);
    }

    @Test
    public void testValorNegativoAdicionalNoturno() {
        Seguranca seguranca = new Seguranca("Roberto", 1500.0, -200.0);
        seguranca.calcularSalario();
        assertEquals(1500.0, seguranca.getSalario(), 0.01);
    }
}
