package classes;

class Repositor extends Funcionario {
    private double hrsTrabalhadas;
    private double valorHora;

    public Repositor(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.hrsTrabalhadas = validaValor(horasTrabalhadas, "Horas trabalhadas não podem ser negativas. Definido como 0.");
        this.valorHora = validaValor(valorPorHora, "Valor por hora não pode ser negativo. Definido como 0.");
        this.salario = calculaSalario();
    }

    @Override
    public double calculaSalario() {
        return hrsTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "Repositor: " + nome +
                ", Horas Trabalhadas: " + String.format("%.2f", hrsTrabalhadas) +
                ", Valor por Hora: R$" + String.format("%.2f", valorHora) +
                ", Salário Total: R$" + String.format("%.2f", calculaSalario());
    }
}