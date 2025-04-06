package classes.entities;

public class Janitor extends Employee{

    private double fixedSalary;
    private int extraShifts;
    private final double BONUS_PER_SHIFT = 100;

    public Janitor(String name, double fixedSalary, int extraShifts) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.extraShifts = extraShifts;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public int getExtraShifts() {
        return extraShifts;
    }
    public void setExtraShifts(int extraShifts) {
        this.extraShifts = extraShifts;
    }
    public double getBONUS_PER_SHIFT() {
        return BONUS_PER_SHIFT;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + (extraShifts*BONUS_PER_SHIFT);
    }

    @Override
    public String getRole() {
        return "Janitor";
    }
    

}
