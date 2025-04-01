class Repositor extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;

    public Repositor(String nome, double valorPorHora, int horasTrabalhadas) {
        super(nome);
        this.valorPorHora = validarValor(valorPorHora, "valor por hora");
        this.horasTrabalhadas = validarValor(horasTrabalhadas, "horas trabalhadas");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salarioFinal = valorPorHora * horasTrabalhadas;
    }
}