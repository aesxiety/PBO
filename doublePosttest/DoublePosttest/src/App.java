
import game.*;
import bank.*;
import PencatatanKaryawan.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Pemanggilan konsep Bank
        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.println("\n=====================================");
        System.out.println("            Sistem Perbankan         ");
        System.out.println("=====================================");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
        
        //Pemanggilan konsep Game
        System.out.println("\n=====================================");
        System.out.println("          Pengembangan Game          ");
        System.out.println("=====================================");
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.move();
        playerCharacter.attack();
        
        //pemanggilan konsep Sistem Pencatatan Karyawan
        Manager manager = new Manager();
        
        System.out.println("\n=====================================");
        System.out.println("       Sistem Pencatatan Karyawan    ");
        System.out.println("=====================================");
        manager.provideBenefits();
        double salary = manager.calculateSalary();
        System.out.println("Manager's salary: Rp" + salary);
        manager.displayCompany();
    }
}
