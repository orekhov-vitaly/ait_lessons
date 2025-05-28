package homeworks.homework_30.transport;

public class Application {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];

        Vehicle car1 = new Car("VW");
        Vehicle car2 = new Car("BMW");
        Vehicle bicycle1 = new Bicycle("Bergamond");
        Vehicle moto1 = new Motorcycle("Free Way");

        vehicles[0] = car1;
        vehicles[1] = car2;
        vehicles[2] = bicycle1;
        vehicles[3] = moto1;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getBrand());
            vehicles[i].startEngine();
        }
    }
}
