package com.annas.teste;


import com.annas.service.cargos.*;
import com.annas.service.colaborador.Pessoa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PessoaTest {
    @Test
    public void testCriarPessoaComCaixa() {
        Caixa cargo = new Caixa("Caixa", "Comercial", 1500.0);

        Pessoa pessoa = new Pessoa("Ana Silva", cargo);

        assertEquals(1500.0, pessoa.getCargo().getSalarioBase(), 0.01);
    }

    @Test
    public void testCriarPessoaComRepositor() {
        Repositor cargo = new Repositor("Repositor", "Noturno", 160.0, 15.0);

        Pessoa pessoa = new Pessoa("João Santos", cargo);

        assertEquals(2400.0, pessoa.getCargo().getSalarioBase(), 0.01);
    }

    @Test
    public void testCriarPessoaComFaxineiro() {
        Faxineiro cargo = new Faxineiro("Faxineiro", "Comercial", 3.0, 1300.0, 200.0);

        Pessoa pessoa = new Pessoa("Maria Oliveira", cargo);

        assertEquals(String.valueOf(1900.0), cargo.calcularSalario(), this);
    }

    @Test
    public void testCriarPessoaComVendedor() {
        Vendedor cargo = new Vendedor("Vendedor", "Comercial", 1500.0, 40.0, 25.0);

        Pessoa pessoa = new Pessoa("Carlos Pereira", cargo);

        assertEquals(2500.0, cargo.calcularSalario(), 0.01); // 1500 + (40 * 25) = 2500
    }

    @Test
    public void testCriarPessoaComSeguranca() {

        Seguranca cargo = new Seguranca("Seguranca", "Noturno", 2200.0);

        Pessoa pessoa = new Pessoa("Pedro Lima", cargo);

        assertEquals("Pedro Lima", pessoa.getNome());
        assertEquals("Seguranca", pessoa.getCargo().getDescricao());
        assertEquals("Noturno", pessoa.getCargo().getTurno());

        assertTrue(cargo.calcularSalario() >= 2200.0);
    }
}
