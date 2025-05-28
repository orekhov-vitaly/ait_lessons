package homeworks.homework_30.transport;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car started.");
    }
}
