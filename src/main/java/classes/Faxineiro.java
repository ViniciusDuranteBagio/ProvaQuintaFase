package classes;

public class Faxineiro extends Funcionario{

    private double salarioFixo;
    private double bonusPorTurno;
    private int qdtTurnosExtras;

    public Faxineiro(String nome, double salarioFixo, double bonusPorTurno, int qdtTurnosExtras) {
        super(nome);
        this.salarioFixo = Math.max(0, salarioFixo);
        this.bonusPorTurno = Math.max(0, bonusPorTurno);
        this.qdtTurnosExtras = Math.max(0, qdtTurnosExtras);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getBonusPorTurno() {
        return bonusPorTurno;
    }

    public void setBonusPorTurno(double bonusPorTurno) {
        this.bonusPorTurno = bonusPorTurno;
    }

    public int getQdtTurnosExtras() {
        return qdtTurnosExtras;
    }

    public void setQdtTurnosExtras(int qdtTurnosExtras) {
        this.qdtTurnosExtras = qdtTurnosExtras;
    }

    @Override
    public double calculaSalario() {
        return this.salarioFixo + (this.bonusPorTurno * this.qdtTurnosExtras);
    }

    @Override
    public String toString() {
        return "Faxineiro: " + getNome() + "\n\n" +
                "Salario: " + String.format("%.2f", salarioFixo) + "\n\n" +
                "Bonus por Turno: " + String.format("%.2f", bonusPorTurno) + "\n\n" +
                "Quantidade de Turnos Extras: " + qdtTurnosExtras + "\n\n" +
                "Salario Total: " + String.format("%.2f", calculaSalario());
    }
}