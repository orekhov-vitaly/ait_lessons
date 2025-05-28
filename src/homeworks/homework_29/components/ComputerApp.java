package homeworks.homework_29.components;

public class ComputerApp {
    public static void main(String[] args) {
        Storage storage = new Storage("WD", "WD-123");

        Computer computer = new Computer("LENOVO-5100", storage, 32);

        System.out.println(computer.toString());

        Storage storage1 = new Storage("Crucial", "C-1000");
        computer.setStorage(storage1);
        System.out.println(computer.toString());
    }
}
