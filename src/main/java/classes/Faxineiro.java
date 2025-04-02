package classes;

import classes.interfaces.iCadastro;

import javax.swing.*;
import java.util.Scanner;

public class Faxineiro extends Funcionario implements iCadastro {
    protected int turno;
    protected double vlTurno;

    //Methods
    public double vSalario() {
        return  salario + (turno * vlTurno);
    }

    @Override
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Faxineiro: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o salario do Faxineiro: $");
        setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade de turnos extras do Faxineiro: ");
        setTurno(Integer.parseInt(scanner.nextLine()));
        System.out.print("Digite o valor pago pelos turnos extras do Faxineiro: $");
        setVlTurno(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nSalario: $" + vSalario();
    }

    //Constructors
    public Faxineiro() {
    }

    //Getter & Setter

    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        if (turno >= 0) {
            this.turno = turno;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.turno = 0;
        }
    }
        public double getVlTurno() {
            return vlTurno;
        }

        public void setVlTurno(double vlTurno) {
            if (vlTurno >= 0) {
                this.vlTurno = vlTurno;
            } else {
                System.out.println("!Valor, não permitido. Definido como 0!");
                this.vlTurno = 0;
            }
        }
}
