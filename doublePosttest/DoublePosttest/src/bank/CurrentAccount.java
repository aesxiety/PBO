package bank;

public class CurrentAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited $" + amount + " into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn $" + amount + " from Current Account.");
    }
}