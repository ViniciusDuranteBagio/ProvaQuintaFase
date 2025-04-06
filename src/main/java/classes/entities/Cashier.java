package classes.entities;

public class Cashier extends Employee {
    private double fixedSalary;

    public Cashier(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }

    @Override
    public String getRole() {
        return "Cashier";
    }
    
}
