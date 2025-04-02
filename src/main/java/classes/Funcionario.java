package classes;

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public double calculaSalario() {
        return salario;
    } //Vazio pois cada classe filha vai ter seu modo de calculo ou nem vai ter calculo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    protected double validaValor(double valor, String msgErro) {
        if (valor < 0) {
            System.out.println(msgErro);
            return 0; //Aqui não deixa colocar menor que zero, já que ninguém paga pra trabalha slk
        }
        return valor;
    }
}