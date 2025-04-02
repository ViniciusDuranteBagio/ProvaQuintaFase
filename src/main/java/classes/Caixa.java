package classes;

import classes.interfaces.iCadastro;

import java.util.Scanner;

public class Caixa extends Funcionario implements iCadastro {

    //Methods
    @Override
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o salário do funcionario: $");
        setSalario(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nSalario: " + getSalario();
    }

    //Constructors
    public Caixa(){
    }
}
