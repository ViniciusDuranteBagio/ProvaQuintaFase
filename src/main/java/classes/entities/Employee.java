package classes.entities;

public abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract String getRole();

    @Override
    public String toString() {
        return String.format("%s%nName: %s %nSalary: %.2f", getRole(), name, calculateSalary());
    }
}
