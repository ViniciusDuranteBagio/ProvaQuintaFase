package classes;

import classes.interfaces.iCadastro;
import java.util.Scanner;

public class Vendedor extends Funcionario implements  iCadastro{
    protected double vlComissao;
    protected  int qtComissao;

    //Methods
    public double vSalario(){
        return  salario + (vlComissao * qtComissao);
    }

    @Override
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Vendedor: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o salário do Vendedor: $");
        setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite o valor da comissao do Vendedor: $");
        setVlComissao(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade da comissao do Vendedor: ");
        setQtComissao(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nSalario: $" + vSalario();
    }

    //Constructors
    public Vendedor(){
    }

    //Getter & Setter
    public double getVlComissao() {
        return vlComissao;
    }
    public void setVlComissao(double vlComissao) {
        if (vlComissao >= 0) {
            this.vlComissao = vlComissao;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.vlComissao = 0;
        }
    }

    public int getQtComissao() {
        return qtComissao;
    }
    public void setQtComissao(int qtComissao) {
        if (qtComissao >= 0) {
            this.qtComissao = qtComissao;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.qtComissao = 0;
        }
    }
}
