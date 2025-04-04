package classes;

public class Faxineiro extends Funcionario {

    private double salarioFixo;
    private double bonusTurno;
    private double turnosExtras;

    public Faxineiro(String nome, double salarioFixo, double bonusTurno, int turnosExtras) {
        super(nome);
        this.salarioFixo = validarValor(salarioFixo);
        this.bonusTurno = validarValor(bonusTurno);
        this.turnosExtras = validarValor(turnosExtras);
    }

    @Override
    public void calcularSalario() {
        salario = salarioFixo + (bonusTurno * turnosExtras);
    }
}
