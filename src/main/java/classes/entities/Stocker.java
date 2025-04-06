package classes.entities;

public class Stocker extends Employee{
    private int workedHours;
    private final double HOURLY_WAGE = 30;

    public Stocker(String name, int workedHours) {
        super(name);
        this.workedHours = workedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public double getHOURLY_WAGE() {
        return HOURLY_WAGE;
    }

    @Override
    public double calculateSalary() {
        return workedHours*HOURLY_WAGE;
    }

    @Override
    public String getRole() {
        return "Stocker";
    }
}
