package classes;

class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissaoVenda;
    private int qtdVendas;

    public Vendedor(String nome, double salarioBase, double comissaoPorVenda, int quantidadeVendas) {
        super(nome);
        this.salarioBase = validaValor(salarioBase, "Salário base não pode ser negativo. Definido como 0.");
        this.comissaoVenda = validaValor(comissaoPorVenda, "Comissão por venda não pode ser negativa. Definido como 0.");
        this.qtdVendas = (int) validaValor(quantidadeVendas, "Quantidade de vendas não pode ser negativa. Definido como 0.");
        this.salario = calculaSalario();
    }

    @Override
    public double calculaSalario() {
        return salarioBase + (comissaoVenda * qtdVendas);
    }

    @Override
    public String toString() {
        return "Vendedor: " + nome +
                ", Salário Base: R$" + String.format("%.2f", salarioBase) +
                ", Comissão por Venda: R$" + String.format("%.2f", comissaoVenda) +
                ", Vendas: " + qtdVendas +
                ", Salário Total: R$" + String.format("%.2f", calculaSalario());
    }
}