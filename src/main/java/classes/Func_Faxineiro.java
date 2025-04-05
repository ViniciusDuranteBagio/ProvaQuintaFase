package classes;

public class Func_Faxineiro extends Funcionario {
    private int qntTurnosExtra;
    private double bonusTurnoExtra;

    public Func_Faxineiro(String nome, double salario, double bonusTurnoExtra, int qntTurnosExtra) {
        super(nome, salario);
        this.bonusTurnoExtra = validarValor(bonusTurnoExtra);
        this.qntTurnosExtra = Math.max(qntTurnosExtra, 0); // "max" impede que a quantidade de turnos seja negativa, e se for vira zero
    }

    @Override
    public double calcularSalario() {
        return salario + (bonusTurnoExtra * qntTurnosExtra);
    }
}
