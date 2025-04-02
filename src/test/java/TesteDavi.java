import classes.Davi.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteDavi {

    @Test
    public void testFuncionarioCaixa() {
        FuncionarioCaixa caixa = new FuncionarioCaixa("João", 1500);
        assertEquals(1500, caixa.getSalario());
        assertEquals(1500, caixa.calcularSalario());
    }

    @Test
    public void testFuncionarioVendedor() {
        FuncionarioVendedor vendedor = new FuncionarioVendedor("Maria", 1000, 50, 20);
        double salarioEsperado = 1000 + (50 * 20);
        assertEquals(salarioEsperado, vendedor.getSalario());
        assertEquals(salarioEsperado, vendedor.calcularSalario());
    }

    @Test
    public void testFuncionarioVendedorComValorNegativo() {
        FuncionarioVendedor vendedor = new FuncionarioVendedor("Carlos", -1000, -50, -10);
        assertEquals(0, vendedor.getSalario());
    }

    @Test
    public void testFuncionarioRepositor() {
        FuncionarioRepositor repositor = new FuncionarioRepositor("Anna", 10, 160);
        assertEquals(10 * 160, repositor.getSalario());
        assertEquals(10 * 160, repositor.calcularSalario());
    }

    @Test
    public void testFuncionarioRepositorComValorNegativo() {
        FuncionarioRepositor repositor = new FuncionarioRepositor("Ricardo", -15, -50);
        assertEquals(0, repositor.getSalario());
    }

    @Test
    public void testFuncionarioSegurancaSemAdicionalNoturno() {
        FuncionarioSeguranca seguranca = new FuncionarioSeguranca("José", 1500, false);
        assertEquals(1500, seguranca.getSalario());
    }

    @Test
    public void testFuncionarioSegurancaComAdicionalNoturno() {
        FuncionarioSeguranca seguranca = new FuncionarioSeguranca("Lucas", 1500, true);
        assertEquals(1500 + 200, seguranca.getSalario());
    }

    @Test
    public void testFuncionarioFaxineiroComTurnosExtras() {
        FuncionarioFaxineiro faxineiro = new FuncionarioFaxineiro("Fernanda", 1200, 5, 50);
        double salarioEsperado = 1200 + (5 * 50);
        assertEquals(salarioEsperado, faxineiro.getSalario());
    }

    @Test
    public void testFuncionarioFaxineiroSemTurnosExtras() {
        FuncionarioFaxineiro faxineiro = new FuncionarioFaxineiro("Roberta", 1200, 0, 0);
        assertEquals(1200, faxineiro.getSalario());
    }

    @Test
    public void testFuncionarioFaxineiroComValorNegativo() {
        FuncionarioFaxineiro faxineiro = new FuncionarioFaxineiro("Paula", -1200, -5, -50);
        assertEquals(0, faxineiro.getSalario());
    }

    @Test
    public void testFuncionarioComValoresNegativos() {
        FuncionarioCaixa caixa = new FuncionarioCaixa("Felipe", -1500);
        FuncionarioVendedor vendedor = new FuncionarioVendedor("Júlia", -1000, -50, -20);
        FuncionarioRepositor repositor = new FuncionarioRepositor("Sofia", -10, -160);
        FuncionarioSeguranca seguranca = new FuncionarioSeguranca("Pedro", -1500, true);
        FuncionarioFaxineiro faxineiro = new FuncionarioFaxineiro("Lúcia", -1200, -5, -50);
        assertEquals(0, caixa.getSalario());
        assertEquals(0, vendedor.getSalario());
        assertEquals(0, repositor.getSalario());
        assertEquals(0, seguranca.getSalario());
        assertEquals(0, faxineiro.getSalario());
    }
}
