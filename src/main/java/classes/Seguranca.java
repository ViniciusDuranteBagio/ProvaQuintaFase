package classes;

public class Seguranca extends Funcionario{

    private double salarioFixo;
    private double adionalNoturno;

    public Seguranca(String nome, double salarioFixo, double adionalNoturno) {
        super(nome);
        this.salarioFixo = Math.max(0, salarioFixo);
        this.adionalNoturno = Math.max(0, adionalNoturno);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getAdionalNoturno() {
        return adionalNoturno;
    }

    public void setAdionalNoturno(double adionalNoturno) {
        this.adionalNoturno = adionalNoturno;
    }

    @Override
    public double calculaSalario() {
        return this.salarioFixo + this.adionalNoturno;
    }

    @Override
    public String toString() {
        return "Seguranca: " + getNome() + "\n\nSalario: " + String.format("%.2f", salarioFixo) + "\n\nAdicional Noturno: " + String.format("%.2f", adionalNoturno) + "\n\nSalario Total: " + String.format("%.2f",calculaSalario());
    }
}
