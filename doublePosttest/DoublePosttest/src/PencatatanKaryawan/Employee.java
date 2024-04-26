package PencatatanKaryawan;

public abstract class Employee {
    public final String COMPANY_NAME = "PT PujaSera tbk"; // final variable

    public abstract double calculateSalary();

    // final method
    public final void displayCompany() {
        System.out.println("\nCompany: " + COMPANY_NAME);
    }
}
