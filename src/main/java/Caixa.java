class Caixa extends Funcionario {
    private double salarioFixo;

    public Caixa(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = validarValor(salarioFixo, "salário fixo");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioFixo;
    }
}