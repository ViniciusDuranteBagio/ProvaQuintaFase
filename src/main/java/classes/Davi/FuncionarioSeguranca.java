package classes.Davi;

public class FuncionarioSeguranca extends Funcionario {
    private double salarioBase;
    private boolean trabalhouNoite;
    private static final double ADICIONAL_NOTURNO = 200;  // Aqui como é fixo um final encaixa bem.

    public FuncionarioSeguranca(String nome, double salarioBase, boolean trabalhouNoite) {
        super(nome, "Segurança");
        this.salarioBase = validarValor(salarioBase);
        this.trabalhouNoite = trabalhouNoite;
    }

    public double calcularSalario() {
        if (salarioBase > 0 && trabalhouNoite) {
            return salarioBase + ADICIONAL_NOTURNO;
        } else {
            return salarioBase;
        }

        // tive que arrumar isso porque meus teste estavam falhando porque ainda somava adicional noturno mesmo 0.
    }
    @Override
    public double getSalario() {
        return calcularSalario();
    }
}