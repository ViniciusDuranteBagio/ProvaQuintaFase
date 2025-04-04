package classes;

public class Seguranca extends Funcionario {

    private double salarioFixo;
    private double addNoturno;

    public Seguranca(String nome, double salarioFixo, double addNoturno) {
        super(nome);
        this.salarioFixo = validarValor(salarioFixo);
        this.addNoturno = validarValor(addNoturno);
    }

    @Override
    public void calcularSalario() {
        if (addNoturno > 0) {
            salario = salarioFixo + addNoturno;
        } else {
            salario = salarioFixo;
        }
    }
}
