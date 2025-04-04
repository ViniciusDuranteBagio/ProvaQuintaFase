class Seguranca extends Funcionario {
    private double salarioFixo;
    private double adicionalNoturno;
    private boolean trabalhaNoturno;

    public Seguranca(String nome, double salarioFixo, boolean trabalhaNoturno, double adicionalNoturno) {
        super(nome);
        this.salarioFixo = validarValor(salarioFixo, "salário fixo");
        this.trabalhaNoturno = trabalhaNoturno;
        this.adicionalNoturno = trabalhaNoturno ? validarValor(adicionalNoturno, "adicional noturno") : 0;
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salarioFinal = salarioFixo + (trabalhaNoturno ? adicionalNoturno : 0);
    }
}
