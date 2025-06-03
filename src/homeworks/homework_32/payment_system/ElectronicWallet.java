package homeworks.homework_32.payment_system;

public class ElectronicWallet implements PaymentSystem{
    private String currency;
    private double balance;

    public ElectronicWallet(double balance) {
        this.currency = "COIN";
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if(amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Operation completed successfully");
            return;
        }
        System.out.println("Operation failed");
    }

    @Override
    public void depositTransfer(double amount) {
        if(amount < 0) {
            System.out.println("Operation failed");
        }
        this.balance += amount;
        System.out.println("Operation completed successfully");
    }

    @Override
    public void checkBalance() {
        System.out.printf("Current balance: %.2f %s\n", this.balance, this.currency);
    }
}
