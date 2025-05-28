package homeworks.homework_30.transport;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("No engine!");
    }
}
