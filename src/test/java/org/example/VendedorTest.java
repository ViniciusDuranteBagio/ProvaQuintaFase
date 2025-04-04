package org.example;

import classes.Vendedor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendedorTest {

    @Test
    public void testCalcularSalario() {
        Vendedor vendedor = new Vendedor("Maria", 1000.0, 50.0, 10);
        vendedor.calcularSalario();
        assertEquals(1500.0, vendedor.getSalario(), 0.01);
    }

    @Test
    public void testValorNegativoComissao() {
        Vendedor vendedor = new Vendedor("Maria", 1000.0, -50.0, 10);
        vendedor.calcularSalario();
        assertEquals(1000.0, vendedor.getSalario(), 0.01);
    }
}
