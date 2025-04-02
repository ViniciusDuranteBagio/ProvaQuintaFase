package classes.Davi;

public class FuncionarioRepositor extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioRepositor(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, "Repositor");
        this.valorHora = validarValor(valorHora);
        if (horasTrabalhadas < 0) {
            this.horasTrabalhadas = 0;      //eu poderia criar um método para não ficar repetindo esses if feião como fiz acima,
        } else {                            // eu acho muito feio assim, massss to com um pouco de preguiça perdão...
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public double getSalario() {
        return calcularSalario();
    }
}