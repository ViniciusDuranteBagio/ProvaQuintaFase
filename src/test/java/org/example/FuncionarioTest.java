import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import classes.*;

public class FuncionarioTest {

    @Test
    public void testCaixaSalarioFixo() {
        Caixa caixa = new Caixa("João", 3000);
        caixa.calcularSalario();
        assertEquals(3000, caixa.getSalario());
    }

    @Test
    public void testVendedorSalarioComComissao() {
        Vendedor vendedor = new Vendedor("Maria", 2000, 100, 5);
        vendedor.calcularSalario();
        assertEquals(2500, vendedor.getSalario());
    }

    @Test
    public void testRepositorPorHora() {
        Repositor repositor = new Repositor("Carlos", 20, 160);
        repositor.calcularSalario();
        assertEquals(3200, repositor.getSalario());
    }

    @Test
    public void testSegurancaSemAdicional() {
        Seguranca seguranca = new Seguranca("Pedro", 2500, 0);
        seguranca.calcularSalario();
        assertEquals(2500, seguranca.getSalario());
    }

    @Test
    public void testSegurancaComAdicional() {
        Seguranca seguranca = new Seguranca("Paulo", 2500, 300);
        seguranca.calcularSalario();
        assertEquals(2800, seguranca.getSalario());
    }

    @Test
    public void testFaxineiroSemTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Ana", 1800, 100, 0);
        faxineiro.calcularSalario();
        assertEquals(1800, faxineiro.getSalario());
    }

    @Test
    public void testFaxineiroComTurnoExtra() {
        Faxineiro faxineiro = new Faxineiro("Luiza", 1800, 100, 3);
        faxineiro.calcularSalario();
        assertEquals(2100, faxineiro.getSalario());
    }

    @Test
    public void testValoresNegativosSaoZerados() {
        Vendedor vendedor = new Vendedor("Teste", -1000, -50, 5);
        vendedor.calcularSalario();
        // Salário base e comissão foram zerados, então salário deve ser 0
        assertEquals(0, vendedor.getSalario());

        Repositor repositor = new Repositor("Teste2", -20, -160);
        repositor.calcularSalario();
        assertEquals(0, repositor.getSalario());

        Faxineiro faxineiro = new Faxineiro("Teste3", -2000, -100, -2);
        faxineiro.calcularSalario();
        assertEquals(0, faxineiro.getSalario());

        Seguranca seguranca = new Seguranca("Teste4", -1500, -200);
        seguranca.calcularSalario();
        assertEquals(0, seguranca.getSalario());

        Caixa caixa = new Caixa("Teste5", -2500);
        caixa.calcularSalario();
        assertEquals(0, caixa.getSalario());
    }
}
