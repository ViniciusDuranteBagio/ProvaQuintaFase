package classes;

public class Vendedor extends Funcionario{

    private double salarioBase;
    private double comissao;
    private int qtdVendas;

    public Vendedor(String nome, double salarioBase, double comissao, int qtdVendas) {
        super(nome);
        this.salarioBase = Math.max(0, salarioBase);
        this.comissao = Math.max(0, comissao);
        this.qtdVendas = Math.max(0, qtdVendas);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    @Override
    public double calculaSalario() {
        return this.salarioBase + (this.comissao * this.qtdVendas);
    }

    @Override
    public String toString() {
        return "Vendedor: " + getNome() + "\n\nSalario Base: " + String.format("%.2f",salarioBase) + "\n\nComissao: " +
                String.format("%.2f", comissao) + "\n\nQuantidade de Vendas: " + qtdVendas + "\n\nSalario Total: " +
                String.format("%.2f", calculaSalario());
    }
}
