package classes.entities;

public class SecurityGuard extends Employee{

    private double fixedSalary;
    private final double NIGHT_SHIFT_BONUS = 0.25;
    private boolean worksNightShift = false;

    public SecurityGuard(String name, double fixedSalary, boolean worksNightShift) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.worksNightShift = worksNightShift;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double getNIGHT_SHIFT_BONUS() {
        return NIGHT_SHIFT_BONUS;
    }
    
    public boolean isWorksNightShift() {
        return worksNightShift;
    }

    @Override
    public double calculateSalary() {
        if (worksNightShift) return fixedSalary + (fixedSalary*NIGHT_SHIFT_BONUS);
        return fixedSalary;
    }

    @Override
    public String getRole() {
        return "Security Guard";
    }

}
