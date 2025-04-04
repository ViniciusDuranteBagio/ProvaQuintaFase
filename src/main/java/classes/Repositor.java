package classes;

public class Repositor extends Funcionario {

    private double valorPorHora;
    private double horasTrabalhadas;

    public Repositor(String nome, double valorPorHora, double horasTrabalhadas) {
        super(nome);
        this.valorPorHora = validarValor("Valor por hora", valorPorHora);
        this.horasTrabalhadas = validarValor("Horas trabalhadas", horasTrabalhadas);
    }

    @Override
    public void calcularSalario() {
        salario = valorPorHora * horasTrabalhadas;
    }
}
