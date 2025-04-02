package classes;

class Caixa extends Funcionario {
    public Caixa(String nome, double salarioFixo) {
        super(nome);
        this.salario = validaValor(salarioFixo, "Salário fixo não pode ser negativo. Definido como 0.");
    }

    @Override
    public String toString() {
        return "Caixa: " + nome + ", Salário Fixo: R$" + String.format("%.2f", salario);
    }
}