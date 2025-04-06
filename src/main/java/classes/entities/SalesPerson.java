package classes.entities;

public class Salesperson extends Employee {
    private double fixedSalary;
    private double salesThisMonth;
    private final double SALE_COMISSION = 0.05;

    public Salesperson(String name, double fixedSalary, double salesThisMonth) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.salesThisMonth = salesThisMonth;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double getSalesThisMonth() {
        return salesThisMonth;
    }
    public void setSalesThisMonth(double salesThisMonth) {
        this.salesThisMonth = salesThisMonth;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + (salesThisMonth*SALE_COMISSION);
    }

    @Override
    public String getRole() {
        return "Salesperson";
    }
}
