package classes;

public class Faxineiro extends Funcionario {

    private double salarioFixo;
    private double bonusPorTurnoExtra;
    private int turnosExtras;

    public Faxineiro(String nome, double salarioFixo, double bonusPorTurnoExtra, int turnosExtras) {
        super(nome);
        this.salarioFixo = validarValor("Salário fixo", salarioFixo);
        this.bonusPorTurnoExtra = validarValor("Bônus por turno extra", bonusPorTurnoExtra);
        this.turnosExtras = Math.max(0, turnosExtras);
    }

    @Override
    public void calcularSalario() {
        salario = salarioFixo + (bonusPorTurnoExtra * turnosExtras);
    }
}
