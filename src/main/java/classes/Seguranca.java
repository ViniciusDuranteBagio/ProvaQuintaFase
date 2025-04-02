package classes;

class Seguranca extends Funcionario {
    private boolean periodoNoturno;
    private double adicionalNoturno;

    public Seguranca(String nome, double salarioFixo, boolean periodoNoturno, double adicionalNoturno) {
        super(nome);
        this.salario = validaValor(salarioFixo, "Salário fixo não pode ser negativo. Definido como 0.");
        this.periodoNoturno = periodoNoturno;
        this.adicionalNoturno = validaValor(adicionalNoturno, "Adicional noturno não pode ser negativo. Definido como 0.");
        if (periodoNoturno) {
            this.salario += this.adicionalNoturno;
        }
    }

    @Override
    public String toString() {
        return "Segurança: " + nome +
                ", Salário Base: R$" + String.format("%.2f", salario - (periodoNoturno ? adicionalNoturno : 0)) +
                ", Período Noturno: " + (periodoNoturno ? "Sim" : "Não") +
                ", Adicional Noturno: R$" + (periodoNoturno ? String.format("%.2f", adicionalNoturno) : "0.00") +
                ", Salário Total: R$" + String.format("%.2f", salario);
    }
}