package homeworks.homework_32.task_2_1;

public class BankAccount extends VisaMember{
    public BankAccount(String title) {
        super(title);
        currency = "EUR";
        typeAccount = "Bank";
    }

    @Override
    public void transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > checkBalance()) {
            System.out.printf("Недостаточно средств (%s)! Trancfer %.2f | balance %.2f\n", getTitle(), amountEur, checkBalance());
            return; // false
        }

//        if (recipient.getCurrency().equals("EUR")) {
//            // Переводим на евровый счет (конвертация не нужна)
//            withdrawMoney(amountEur);
//            recipient.depositTransfer(amountEur);
//            System.out.printf("Успех! Перевод (%s -> %s) %.2f EUR завершен", getTitle(), recipient.getTitle(),
//                    amountEur);
//            return; // true
//        }
//
//        if (recipient.getCurrency().equals("BTC")) {
            // Конвертировать евро в валюту получателя
            double amountRecipient = amountEur / recipient.getCourseToEur();
            withdrawMoney(amountEur);
            recipient.depositTransfer(amountRecipient);
            System.out.printf("Успех! Перевод (%s -> %s) %.4f %s -> %.5f %s завершен\n", getTitle(),
                    recipient.getTitle(), amountEur, getCurrency(), amountRecipient, recipient.getCurrency());
//        }
    }

    @Override
    public double getCourseToEur() {
        return 1;
    }
}
