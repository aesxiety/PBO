package PencatatanKaryawan;

public abstract class PermanentEmployee extends Employee {
    public final int ANNUAL_BONUS_PERCENTAGE = 10; 

    public abstract void provideBenefits();

    @Override
    public double calculateSalary() {
        return 0; 
    }
}