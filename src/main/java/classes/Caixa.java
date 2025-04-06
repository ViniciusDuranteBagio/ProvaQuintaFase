package classes;

public class Caixa extends  Funcionario{

    public double salarioFixo;

    public Caixa(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = Math.max(0, salarioFixo);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaSalario() {
        return this.salarioFixo;
    }

    @Override
    public String toString() {
        return "Caixa: " + getNome() + "\n\nSalario: " + salarioFixo + "\n\nSalario Total: " + String.format("%.2f", calculaSalario());
    }


}
