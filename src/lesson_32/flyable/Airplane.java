package lesson_32.flyable;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    public  void takePassenger() {
        System.out.println("Берем пассажира");
    }
}
