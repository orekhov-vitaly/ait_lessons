package homeworks.homework_32.payment_system;

public class Application {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(0);
        bank.depositTransfer(1000.0);
        bank.checkBalance();
        bank.withdrawMoney(1500);
        bank.checkBalance();
        bank.withdrawMoney(450);
        bank.checkBalance();
        System.out.println("===========");

        ElectronicWallet wallet = new ElectronicWallet(200);
        wallet.depositTransfer(120.0);
        wallet.checkBalance();
        wallet.withdrawMoney(1500);
        wallet.checkBalance();
        wallet.withdrawMoney(50);
        wallet.checkBalance();
        System.out.println("===========");
    }
}
