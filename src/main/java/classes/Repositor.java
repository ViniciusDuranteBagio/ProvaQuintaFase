package classes;

import classes.interfaces.iCadastro;

import java.util.Scanner;

public class Repositor extends Funcionario implements iCadastro {
    protected int horas;

    //Methods
    public double vSalario(){
        return  salario * horas;
    }

    @Override
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Repositor: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o valor pago por horas do Repositor: $");
        setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade de horas que o Repositor trabalha no mês: ");
        setHoras(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nSalario: $" + vSalario();
    }

    //Constructors
    public Repositor(){
    }

    //Getter & Setter

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        if (horas >= 0) {
            this.horas = horas;
        } else {
            System.out.println("!Valor, não permitido. Definido como 1!");
            this.horas = 1;
    }
        }
}
