package homeworks.homework_32.payment_system;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    void checkBalance();
    void transferMoney();
}
