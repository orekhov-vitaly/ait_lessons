package lesson_29;

public class App {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "LN-122222119");
        System.out.println("driver info: " + busDriver.toString());

        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("Margo", "LN-1222225");
        bus.setDriver(busDriver1);
        System.out.println(bus.toString());

        System.out.println(busDriver);

        bus.updateAutopilotSoftware("AP-v0002");
        System.out.println(bus.toString());
        System.out.println("========= passengers =========\n");

        Passenger john = new Passenger("John");
        Passenger margo = new Passenger("Margo");
        Passenger peter = new Passenger("Peter");

        System.out.println(john.toString());
        System.out.println(margo.toString());
        System.out.println(peter.toString());

        bus.takePassenger(john);
        bus.takePassenger(john);
        bus.takePassenger(margo);
        bus.takePassenger(peter);
    }
}
