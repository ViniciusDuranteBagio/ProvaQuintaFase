class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissaoPorVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, double salarioBase, double comissaoPorVenda, int quantidadeVendas) {
        super(nome);
        this.salarioBase = validarValor(salarioBase, "salário base");
        this.comissaoPorVenda = validarValor(comissaoPorVenda, "comissão por venda");
        this.quantidadeVendas = validarValor(quantidadeVendas, "quantidade de vendas");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioBase + (comissaoPorVenda * quantidadeVendas);
    }
}