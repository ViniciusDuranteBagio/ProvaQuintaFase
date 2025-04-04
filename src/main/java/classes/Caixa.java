package classes;

public class Caixa extends Funcionario {

    private double salarioFixo;

    public Caixa(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = validarValor("Salário fixo", salarioFixo);
    }

    @Override
    public void calcularSalario() {
        salario = salarioFixo;
    }
}
