package classes;

public class Func_Seguranca extends Funcionario {
    private double adicionalNoturno;
    private boolean turnoDaNoite; // trabalhou a noite?

    public Func_Seguranca(String nome, double salario, double adicionalNoturno, boolean turnoDaNoite) {
        super(nome, salario);
        this.adicionalNoturno = adicionalNoturno;
        this.turnoDaNoite = turnoDaNoite;
    }

    @Override
    public double calcularSalario() {
        if (turnoDaNoite) {
            return salario + adicionalNoturno;
        } else {
            return salario;
        }
    }
}
