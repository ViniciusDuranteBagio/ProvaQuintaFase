package classes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.entities.*;

public class Main {
    // aqui vai a logica do menu interativo, pode ser feito com joptionpane ou direto no console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        
        int op = 0;
        do {
            System.out.println("""
                Choose an option:

                1 - Cashier
                2 - Salesperson
                3 - Stocker
                4 - Security Guard
                5 - Janitor
                6 - List employees
                
                7 - Exit
                    """);
            
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.println("Enter the employee's name");
                    String nameCashier = sc.nextLine();
                    
                    System.out.println("Enther the fixed salary:");
                    double fixedSalaryCashier = validateValue(sc.nextDouble());
                    sc.nextLine();

                    employees.add(new Cashier(nameCashier, fixedSalaryCashier));
                    System.out.println(employees.get(employees.size() - 1) + "\n");
                    break;
                
                case 2:

                    System.out.println("Enter the employee's name");
                    String nameSalesperson = sc.nextLine();

                    System.out.println("Enther the fixed salary:");
                    double fixedSalarySalesperson = validateValue(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Enter the value of sales made this month:");
                    double salesThisMonthSalesperson = validateValue(sc.nextDouble());
                    sc.nextLine();

                    employees.add(new Salesperson(nameSalesperson, fixedSalarySalesperson, salesThisMonthSalesperson));
                    System.out.println(employees.get(employees.size() - 1) + "\n");

                    break;

                case 3:

                    System.out.println("Enter the employee's name");
                    String nameStocker = sc.nextLine();

                    System.out.println("Enter the number of hours worked this month:");
                    int workedHoursStocker = (int) validateValue(sc.nextInt());
                    sc.nextLine();

                    employees.add(new Stocker(nameStocker, workedHoursStocker));
                    System.out.println(employees.get(employees.size() - 1) + "\n");

                    break;

                case 4:

                    System.out.println("Enter the employee's name");
                    String nameSecurityGuard = sc.nextLine();

                    System.out.println("Enter the fixed salary:");
                    double fixedSalarySecurityGuard = validateValue(sc.nextDouble());
                    sc.nextLine();
                        
                    System.out.println("Does the guard work night shifts? (y/n)");
                    boolean worksNightShiftSecurityGuard =  (sc.nextLine().charAt(0)) == 'y';

                    employees.add(new SecurityGuard(nameSecurityGuard, fixedSalarySecurityGuard, worksNightShiftSecurityGuard));
                    System.out.println(employees.get(employees.size() - 1) + "\n");

                    break;

                case 5:
                    System.out.println("Enter the employee's name");
                    String nameJanitor = sc.nextLine();

                    System.out.println("Enter the fixed salary:");
                    double fixedSalaryJanitor = validateValue(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Enter the number of extra shifts:");
                    int extraShiftsJanitor = (int) validateValue(sc.nextInt());
                    sc.nextLine();

                    employees.add(new Janitor(nameJanitor, fixedSalaryJanitor, extraShiftsJanitor));
                    System.out.println(employees.get(employees.size() - 1) + "\n");

                    break;

                case 6:
                    System.out.println("Employee List:\n");
                    for(Employee e: employees) {
                        System.out.println(e + "\n");
                    }
                    
                    break;
                
                case 7:
                    System.out.println("Shutting down the system...");
                    break;

                default:
                    System.out.println("Invalid value");
                    break;
            }
            
        } while (op!=7);

        sc.close();
    }

    public static double validateValue(double value) {
        if (value < 0) {
            System.out.println("Invalid value. Value set to 0.");
            return 0;
        } 
        return value;
    }
}
