package classes;

public class Vendedor extends Funcionario {

    private double salarioBase;
    private double comissaoVenda;
    private int numeroVendas;

    public Vendedor(String nome, double salarioBase, double comissaoVenda, int numeroVendas) {
        super(nome);
        this.salarioBase = validarValor(salarioBase);
        this.comissaoVenda = validarValor(comissaoVenda);
        this.numeroVendas = numeroVendas;
    }

    @Override
    public void calcularSalario() {
        salario = salarioBase + (comissaoVenda * numeroVendas);
    }
}
