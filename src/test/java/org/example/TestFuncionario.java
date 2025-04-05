package org.example;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFuncionario {
    @Test
    void testCaixaSalarioFixo() { // retorna true -- testa com base no salario fixo
        Func_Caixa caixa = new Func_Caixa("João", 2000);
        assertEquals(2000, caixa.calcularSalario());
    }

    @Test
    void testVendedorComissao() { // retorna true -- testa com base no salário + (comissao * vendas)
        Func_Vendedor vendedor = new Func_Vendedor("Ana", 1500, 50, 10);
        assertEquals(2000, vendedor.calcularSalario());
    }

    @Test
    void testRepositorSalarioPorHora() { // retorna true -- testa com base no salário por horas trabalhadas
        Func_Repositor repositor = new Func_Repositor("José", 20, 100);
        assertEquals(2000, repositor.calcularSalario());
    }

    @Test
    void testSegurancaSemAdicional() { // retorna true -- testa com base no salário do segurança sem adicional noturno
        Func_Seguranca seguranca = new Func_Seguranca("Neymar", 1800, 300, false);
        assertEquals(1800, seguranca.calcularSalario());
    }

    @Test
    void testSegurancaComAdicional() { // retorna true -- testa com base no salário do segurança com adicional noturno
        Func_Seguranca seguranca = new Func_Seguranca("Neymar", 1800, 300, true);
        assertEquals(2100, seguranca.calcularSalario());
    }

    @Test
    void testFaxineiroSemTurnosExtras() { // retorna true -- testa com base no faxineiro sem turnos extras
        Func_Faxineiro faxineiro = new Func_Faxineiro("Bia", 1600, 100, 0);
        assertEquals(1600, faxineiro.calcularSalario());
    }

    @Test
    void testFaxineiroComTurnosExtras() { // retorna true -- testa com base no faxineiro com turnos extras
        Func_Faxineiro faxineiro = new Func_Faxineiro("Bia", 1600, 100, 4);
        assertEquals(2000, faxineiro.calcularSalario());
    }

    @Test
    void testValoresNegativos() { // testa um Vendedor com valores negativos e se o código corrige para zero
        Func_Vendedor vendedor = new Func_Vendedor("Erro", -1500, -50, -5);
        assertEquals(0, vendedor.calcularSalario());
    }
}
