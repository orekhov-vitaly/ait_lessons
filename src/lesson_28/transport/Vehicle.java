package lesson_28.transport;

public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // public Vehicle() {}

    public void start() {
        System.out.println(model + " is started.");
    }

    public void stop() {
        System.out.println(model + " is stopped.");
    }

    public String toString() {
        return model + ", year: " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
