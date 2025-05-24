package lesson_28.transport;

/*
extends - наследование. Bus наследуется от Vehicle.
*/

public class Bus extends Vehicle {
    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // super - обращение к родительскому классу
        super(model, year); // вызов родительского конструктора
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean takePassenger() {
        if(countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + getModel());
            return true;
        }

        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров.\n", getModel(), countPassengers);
        return false;
    }

    public boolean dropPassenger() {
        // TODO реализовать высадку пассажиров и не уйти в минус по кол-ву пассажиров
        return false;
    }
}
