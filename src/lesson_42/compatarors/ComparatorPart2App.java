package lesson_42.compatarors;

import lesson_41.Car;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorPart2App {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 5, 3, 4, 2, 0};
        Arrays.sort(ints);
        System.out.println(ints);

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        printCars(cars);

        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);
        printCars(cars);

        byModel = Comparator.comparing(Car::getModel);
        Arrays.sort(cars, byModel);
        printCars(cars);

        Comparator<Car> byYear = Comparator.comparingInt(car -> car.getYear());
        Arrays.sort(cars, byYear);
        printCars(cars);

        byYear = Comparator.comparing(Car::getYear, Comparator.reverseOrder() /*, Comparator.naturalOrder()*/);
        Arrays.sort(cars, byYear);
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        System.out.println("======== Task 1 =========");
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);

        System.out.println("======== Task 2 =========");
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getModel));
        printCars(cars);
    }

    private static void printCars(Car[] cars) {
        System.out.println("====================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("====================");
    }
}
