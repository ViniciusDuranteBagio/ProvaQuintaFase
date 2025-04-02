package classes.Davi;

public class FuncionarioFaxineiro extends Funcionario {
    private int turnosExtras;
    private double bonusPorTurno;

    public FuncionarioFaxineiro(String nome, double salarioBase, int turnosExtras, double bonusPorTurno) {
        super(nome, "Faxineiro");
        this.salario = Funcionario.validarValor(salarioBase);
        if (turnosExtras < 0) {
            this.turnosExtras = 0;
        } else {
            this.turnosExtras = turnosExtras;
        }
        this.bonusPorTurno = Funcionario.validarValor(bonusPorTurno);
    }

    public double calcularSalario() {
        return salario + (turnosExtras * bonusPorTurno);
    }

    @Override
    public double getSalario() {
        return calcularSalario();
    }
}