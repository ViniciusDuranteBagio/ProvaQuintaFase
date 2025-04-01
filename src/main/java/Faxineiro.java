class Faxineiro extends Funcionario {
    private double salarioFixo;
    private double bonusPorTurno;
    private int turnosExtras;

    public Faxineiro(String nome, double salarioFixo, double bonusPorTurno, int turnosExtras) {
        super(nome);
        this.salarioFixo = validarValor(salarioFixo, "salário fixo");
        this.bonusPorTurno = validarValor(bonusPorTurno, "bônus por turno");
        this.turnosExtras = validarValor(turnosExtras, "turnos extras");
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioFixo + (bonusPorTurno * turnosExtras);
    }
}