package classes;

public class Repositor extends Funcionario{

    private double valorPorHora;
    private int horasTrabalhadas;

    public Repositor(String nome, double valorPorHora, int horasTrabalhadas) {
        super(nome);
        this.valorPorHora = Math.max(0, valorPorHora);
        this.horasTrabalhadas = Math.max(0, horasTrabalhadas);
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() {
        return this.valorPorHora * this.horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Repositor: " + getNome() + "\n\nValor por Hora: " +
                String.format("%.2f",valorPorHora) + "\n\nHoras Trabalhadas: " + horasTrabalhadas +
                "\n\nSalario Total: " + String.format("%.2f", calculaSalario());
    }
}
