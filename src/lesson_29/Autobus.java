package lesson_29;

public class Autobus {
    private static int counter = 1;
    private final int id;
    private final int capacity;
    private BusDriver driver; // Агрегация (мягкая связь)
    private Autopilot autopilot; // Композиция (жесткая связь)
    private final Passenger[] passengers;
    private int countPassengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", countPassengers=" + countPassengers +
                '}';
    }

    public void updateAutopilotSoftware(String newVersion) {
        this.autopilot.setSoftwareVersion(newVersion);
    }

    public boolean takePassenger(Passenger passenger) {
        if(passenger == null) return false;

        if(countPassengers < capacity) {
            if(isPassengerInBus(passenger)) {
                System.out.printf("Пассажир с id %d уже в автобусе с id %d", passenger.getId(), this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d совершил посадку в автобусе с id %d", passenger.getId(), this.id);
            return true;
        }
        System.out.printf("Свободного места в автобусе с id %d нет", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if(passenger.getId() == passengers[i].getId()) {
                return true;
            }
        }
        return false;
    }

    public void showListPassengers() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }

        System.out.println(sb.toString());
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
