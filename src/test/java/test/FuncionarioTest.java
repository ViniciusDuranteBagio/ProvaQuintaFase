package test;

import classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

        @Test
        public void testCaixaSalarioFixo() {
            Caixa caixa = new Caixa("João", 2000.0);
            assertEquals(2000.0, caixa.calculaSalario());
        }

        @Test
        public void testVendedorSalarioComComissao() {
            Vendedor vendedor = new Vendedor("Maria", 1500.0, 50.0, 10);
            assertEquals(2000.0, vendedor.calculaSalario());

        }

        @Test
        public void testRepositorSalarioPorHora() {
            Repositor repositor = new Repositor("Carlos", 20.0, 40);
            assertEquals(800.0, repositor.calculaSalario());

        }

        @Test
        public void testSegurancaSemAdicionalNoturno() {
            Seguranca seguranca = new Seguranca("Ana", 2500.0, 0.0);
            assertEquals(2500.0, seguranca.calculaSalario());

        }

        @Test
        public void testSegurancaComAdicionalNoturno() {
            Seguranca seguranca = new Seguranca("Pedro", 2500.0, 500.0);
            assertEquals(3000.0, seguranca.calculaSalario());

        }

        @Test
        public void testFaxineiroSemTurnosExtras() {
            Faxineiro faxineiro = new Faxineiro("Lucas", 1500.0, 200.0, 0);
            assertEquals(1500.0, faxineiro.calculaSalario());

        }

        @Test
        public void testFaxineiroComTurnosExtras() {
            Faxineiro faxineiro = new Faxineiro("Fernanda", 1500.0, 200.0, 2);
            assertEquals(1900.0, faxineiro.calculaSalario());

        }

        @Test
        public void testValoresNegativosDefinidosComoZero() {
            Caixa caixa = new Caixa("João", -2000.0);
            assertEquals(0.0, caixa.getSalarioFixo());

            Vendedor vendedor = new Vendedor("Maria", -1500.0, -50.0, -10);
            assertEquals(0.0, vendedor.getSalarioBase());
            assertEquals(0.0, vendedor.getComissao());

            Repositor repositor = new Repositor("Carlos", -20.0, -40);
            assertEquals(0.0, repositor.getValorPorHora());
            assertEquals(0, repositor.getHorasTrabalhadas());

            Seguranca seguranca = new Seguranca("Ana", -2500.0, -500.0);
            assertEquals(0.0, seguranca.getSalarioFixo());
            assertEquals(0.0, seguranca.getAdionalNoturno());

            Faxineiro faxineiro = new Faxineiro("Lucas", -1500.0, -200.0, -2);
            assertEquals(0.0, faxineiro.getSalarioFixo());
            assertEquals(0.0, faxineiro.getBonusPorTurno());
            assertEquals(0, faxineiro.getQdtTurnosExtras());

        }
    }
