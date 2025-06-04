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
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public void checkBalance() {
        System.out.printf("Current balance: %.2f %s\n", this.balance, this.currency);
    }

    @Override
    public void transferMoney(PaymentSystem paymentSystem, double amount) {
        if(amount > 0 && this.balance >= amount) {
            this.withdrawMoney(amount);
            paymentSystem.depositTransfer(amount);
        }
    }
}
