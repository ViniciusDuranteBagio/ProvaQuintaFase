package classes;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @org.junit.jupiter.api.Test
    public void testCaixaSalarioPositivo() {
        Caixa caixa = new Caixa("João", 2500.00);
        assertEquals(2500.00, caixa.calculaSalario(), 0.001);
        assertEquals("João", caixa.getNome());
    }

    @org.junit.jupiter.api.Test
    public void testCaixaSalarioNegativo() {
        Caixa caixa = new Caixa("Maria", -1000.00);
        assertEquals(0.00, caixa.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testVendedorComVendas() {
        Vendedor vendedor = new Vendedor("Carlos", 1500.00, 50.00, 10);
        assertEquals(2000.00, vendedor.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testVendedorComValoresInvalidos() {
        Vendedor vendedor = new Vendedor(null, -1500.00, -20.00, -5);
        assertEquals(0.00, vendedor.calculaSalario(), 0.001);
        assertEquals("", vendedor.getNome());
    }

    @org.junit.jupiter.api.Test
    public void testRepositorHorasTrabalhadas() {
        Repositor repositor = new Repositor("Pedro", 160.00, 25.00);
        assertEquals(4000.00, repositor.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testSegurancaDiurno() {
        Seguranca seguranca = new Seguranca("Marcos", 3000.00, false, 500.00);
        assertEquals(3000.00, seguranca.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testSegurancaNoturno() {
        Seguranca seguranca = new Seguranca("Fernanda", 3000.00, true, 500.00);
        assertEquals(3500.00, seguranca.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testFaxineiroComTurnosExtras() {
        Faxineiro faxineiro = new Faxineiro("Roberto", 1800.00, 3, 100.00);
        assertEquals(2100.00, faxineiro.calculaSalario(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testConversorStringParaDouble() {
        assertEquals(100.50, Main.converteDouble("100.50"), 0.001);
        assertEquals(0.00, Main.converteDouble("abc"), 0.001);
        assertEquals(0.00, Main.converteDouble("-100"), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testConversorStringParaInt() {
        assertEquals(10, Main.converteInt("10"));
        assertEquals(0, Main.converteInt("abc"));
        assertEquals(0, Main.converteInt("-5"));
    }
}