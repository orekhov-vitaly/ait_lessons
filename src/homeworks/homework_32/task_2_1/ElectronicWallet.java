package homeworks.homework_32.task_2_1;

public class ElectronicWallet extends VisaMember{
    public ElectronicWallet(String title) {
        super(title);
        currency = "BTC";
        typeAccount = "CryptoWallet";
    }

    @Override
    public void transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > checkBalance()) {
            System.out.printf("Недостаточно средств (%s)! Trancfer %.2f | balance %.2f\n", getTitle(), amountBtc, checkBalance());
            return; // false
        }

        double amountEur = amountBtc * getCourseToEur();

        double amountRecipient = amountEur / recipient.getCourseToEur();

        withdrawMoney(amountBtc);
        recipient.depositTransfer(amountRecipient);
        System.out.printf("Успех! Перевод (%s -> %s) %.4f %s -> %.5f %s завершен\n", getTitle(),
                recipient.getTitle(), amountBtc, getCurrency(), amountRecipient, recipient.getCurrency());
    }

    @Override
    public double getCourseToEur() {
        // Механизм получения текущего курса
        return 100000;
    }
}
