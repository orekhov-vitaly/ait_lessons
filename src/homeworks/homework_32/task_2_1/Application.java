package homeworks.homework_32.task_2_1;

public class Application {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Alpha-Bank");

        System.out.println(bank.checkBalance());

        bank.withdrawMoney(10000);
        bank.depositTransfer(10000);
        System.out.println(bank.checkBalance());

        System.out.println("=============\n");

        BankAccount bank2 = new BankAccount("Betta-Bank");

        bank.transferMoney(5000, bank2);
        System.out.println("=============\n");

        ElectronicWallet wallet = new ElectronicWallet("Binance-Wallet");
        wallet.depositTransfer(1.5);
        System.out.println(wallet.toString());

        wallet.transferMoney(0.5, bank2);

        System.out.println(bank2);
        System.out.println(wallet);
        System.out.println("=============\n");

        ElectronicWallet wallet2 = new ElectronicWallet("Kraken");
        wallet2.transferMoney(0.5, wallet);
    }
}
