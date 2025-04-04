package classes;

public class Repositor extends Funcionario {

    private double valorHora;
    private double horasTrabalho;

    public Repositor(String nome, double valorHora, double horasTrabalho) {
        super(nome);
        this.valorHora = validarValor(valorHora);
        this.horasTrabalho = validarValor(horasTrabalho);
    }

    @Override
    public void calcularSalario() {
        salario = valorHora * horasTrabalho;
    }
}
