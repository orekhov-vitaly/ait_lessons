package lesson_26;

public class CarApp {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 200);

        System.out.println(bmw.toString());
        System.out.println("static totalCars = " + Car.totalCars); // Обращение к статическому полю от имени класса

        Car vw = new Car("VW", 300);

        System.out.println(vw.toString());
        System.out.println("static totalCars = " + Car.totalCars); // Обращение к статическому полю от имени класса

        System.out.println(bmw.toString());

        System.out.println("vw.totalCars = " + vw.totalCars); // Обращение к статическому полю от имени объекта. НО
        // так делать не рекомендуется

        System.out.println("=============\n");

        int sum = MathUtil.sumIntegers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum = " + sum);
    }
}
