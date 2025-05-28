package homeworks.homework_30.transport;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle started.");
    }
}
