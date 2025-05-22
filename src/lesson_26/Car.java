package lesson_26;

public class Car {

    static int totalCars;

    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;

        totalCars++;
    }

    public String toString() {
        return String.format("Auto: model %s, power %d. Всего сделано машин: %d", model, power, totalCars);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
