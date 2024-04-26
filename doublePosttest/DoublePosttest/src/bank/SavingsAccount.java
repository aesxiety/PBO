package bank;

public class SavingsAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited $" + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn $" + amount + " from Savings Account.");
    }
}
