import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FuncionarioTest {
    @Test
    void testCaixa() {
        Caixa caixa = new Caixa("João", 2000);
        assertEquals(2000, caixa.salarioFinal, 0.01);
    }

    @Test
    void testVendedor() {
        Vendedor vendedor = new Vendedor("Maria", 1500, 50, 10);
        assertEquals(2000, vendedor.salarioFinal, 0.01);
    }

    @Test
    void testRepositor() {
        Repositor repositor = new Repositor("Carlos", 20, 100);
        assertEquals(2000, repositor.salarioFinal, 0.01);
    }

    @Test
    void testSegurancaNoturno() {
        Seguranca seguranca = new Seguranca("Pedro", 1800, true, 500);
        assertEquals(2300, seguranca.salarioFinal, 0.01);
    }

    @Test
    void testSegurancaDiurno() {
        Seguranca seguranca = new Seguranca("Pedro", 1800, false, 500);
        assertEquals(1800, seguranca.salarioFinal, 0.01);
    }

    @Test
    void testFaxineiro() {
        Faxineiro faxineiro = new Faxineiro("Ana", 1200, 100, 5);
        assertEquals(1700, faxineiro.salarioFinal, 0.01);
    }


    @Test
    void testCaixaSalarioNegativo() {
        Caixa caixa = new Caixa("João", -2000);
        assertEquals(0, caixa.salarioFinal, 0.01);
    }
    @Test
    void testVendedorValoresNegativos() {
        Vendedor vendedor = new Vendedor("Maria", -1500, -50, -10);
        assertEquals(0, vendedor.salarioFinal, 0.01);
    }

    @Test
    void testRepositorValoresNegativos() {
        Repositor repositor = new Repositor("Carlos", -20, -100);
        assertEquals(0, repositor.salarioFinal, 0.01);
    }

    @Test
    void testSegurancaValoresNegativos() {
        Seguranca seguranca = new Seguranca("Pedro", -1800, true, -500);
        assertEquals(0, seguranca.salarioFinal, 0.01);
    }

    @Test
    void testFaxineiroValoresNegativos() {
        Faxineiro faxineiro = new Faxineiro("Ana", -1200, -100, -5);
        assertEquals(0, faxineiro.salarioFinal, 0.01);
    }
}
