package org.example;

import classes.Repositor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepositorTest {

    @Test
    public void testCalcularSalario() {
        Repositor repositor = new Repositor("Carlos", 15.0, 160);
        repositor.calcularSalario();
        assertEquals(2400.0, repositor.getSalario(), 0.01);
    }

    @Test
    public void testValorNegativoValorHora() {
        Repositor repositor = new Repositor("Carlos", -15.0, 160);
        repositor.calcularSalario();
        assertEquals(0.0, repositor.getSalario(), 0.01);
    }
}
