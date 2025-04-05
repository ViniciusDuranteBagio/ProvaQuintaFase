package classes;

public class Func_Vendedor extends Funcionario {

    private double comissao;
    private int vendas;

    public Func_Vendedor(String nome, double salario, double comissao, int vendas) {
        super(nome, Math.max(salario, 0)); // garante que o salário não seja negativo
        this.comissao = validarValor(comissao);
        this.vendas = Math.max(vendas, 0); // garante que o número de vendas não seja negativo
    }

    @Override
    public double calcularSalario() {
        return salario + (comissao * vendas);
    }

    // Método de validação para comissões
    public double validarValor(double valor) {
        return Math.max(valor, 0);
    }
}
