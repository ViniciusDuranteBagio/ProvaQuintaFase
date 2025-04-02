package classes;

import classes.interfaces.iCadastro;

import java.util.Scanner;

public class Seguranca extends Funcionario implements iCadastro {
    protected boolean noturno;
    protected  double vlNoturno;

    //Methods
    public double vSalario(){
        if (noturno){
            return salario + vlNoturno;
        }else {
            return salario;
        }
    }

    @Override
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Segurança: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o salário do Segurança: $");
        setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite se o Segurança é noturno (S=Sim/N=Não): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            setNoturno(true);
            System.out.print("Digite o valor do adicional noturno: ");
            setVlNoturno(Double.parseDouble(scanner.nextLine()));
        } else{
            System.out.println("Segurança NÃO cadastrado como noturno (Opção 'N' ou nenhuma opção valida inserida)");
            setNoturno(false);
        }
    }

    @Override
    public String toString(){
        if (isNoturno()) {
            return "Nome: " + getNome() +
                    "\nNoturno: Sim" +
                    "\nSalario: $" + vSalario();
        }else {
            return "Nome: " + getNome() +
                    "\nNoturno: Não" +
                    "\nSalario: $" + vSalario();
        }
    }

    //Constructors
    public Seguranca() {
    }

    //Getter & Setter
    public boolean isNoturno() {
        return noturno;
    }
    public void setNoturno(boolean noturno) {
        this.noturno = noturno;
    }

    public double getVlNoturno() {
        return vlNoturno;
    }
    public void setVlNoturno(double vlNoturno) {
        if (vlNoturno >= 0) {
            this.vlNoturno = vlNoturno;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.vlNoturno = 0;
        }
    }
}
