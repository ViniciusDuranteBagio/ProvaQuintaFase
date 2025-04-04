package classes;

public class Vendedor extends Funcionario {

    private double salarioBase;
    private double comissaoPorVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, double salarioBase, double comissaoPorVenda, int quantidadeVendas) {
        super(nome);
        this.salarioBase = validarValor("Salário base", salarioBase);
        this.comissaoPorVenda = validarValor("Comissão por venda", comissaoPorVenda);
        this.quantidadeVendas = Math.max(0, quantidadeVendas);
    }

    @Override
    public void calcularSalario() {
        salario = salarioBase + (comissaoPorVenda * quantidadeVendas);
    }
}
