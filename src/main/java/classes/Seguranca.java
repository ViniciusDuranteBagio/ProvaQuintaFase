package classes;

public class Seguranca extends Funcionario {

    private double salarioFixo;
    private double adicionalNoturno;

    public Seguranca(String nome, double salarioFixo, double adicionalNoturno) {
        super(nome);
        this.salarioFixo = validarValor("Salário fixo", salarioFixo);
        this.adicionalNoturno = validarValor("Adicional noturno", adicionalNoturno);
    }

    @Override
    public void calcularSalario() {
        salario = salarioFixo + adicionalNoturno;
    }
}
