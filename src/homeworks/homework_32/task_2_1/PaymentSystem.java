package homeworks.homework_32.task_2_1;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    void transferMoney(double amount, PaymentSystem recipient);

    String getTitle();

    // Получение валюты счета
    String getCurrency();

    //
    double getCourseToEur();
}
