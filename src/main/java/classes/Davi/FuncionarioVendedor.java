package classes.Davi;

public class FuncionarioVendedor extends Funcionario {
    private double salarioBase;
    private double comissaoPorVenda;
    private int numVendas;

    public FuncionarioVendedor(String nome, double salarioBase, double comissaoPorVenda, int numVendas) {
        super(nome, "Vendedor");
        this.salarioBase = validarValor(salarioBase);
        this.comissaoPorVenda = comissaoPorVenda;
        this.numVendas = numVendas < 0 ? 0 : numVendas;
    }


    public double calcularSalario() {
        return salarioBase + (comissaoPorVenda * numVendas);
    }
    @Override
    public double getSalario() {
        return calcularSalario();
    }

}