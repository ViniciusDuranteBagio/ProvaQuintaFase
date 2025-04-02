package classes;

class Faxineiro extends Funcionario {
    private int turnosExtras;
    private double bonusTurno;

    public Faxineiro(String nome, double salarioFixo, int turnosExtras, double bonusPorTurno) {
        super(nome);
        this.salario = validaValor(salarioFixo, "Salário fixo não pode ser negativo. Definido como 0.");
        this.turnosExtras = (int) validaValor(turnosExtras, "Turnos extras não podem ser negativos. Definido como 0.");
        this.bonusTurno = validaValor(bonusPorTurno, "Bônus por turno não pode ser negativo. Definido como 0.");
        this.salario += turnosExtras * bonusPorTurno;
    }

    @Override
    public String toString() {
        return "Faxineiro: " + nome +
                ", Salário Base: R$" + String.format("%.2f", salario - (turnosExtras * bonusTurno)) +
                ", Turnos Extras: " + turnosExtras +
                ", Bônus por Turno: R$" + String.format("%.2f", bonusTurno) +
                ", Salário Total: R$" + String.format("%.2f", salario);
    }
}