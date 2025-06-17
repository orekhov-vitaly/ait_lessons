package lesson_41;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
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

        Arrays.sort(cars);

        printCars(cars);

        System.out.println("Speed Comparator: ");
        CarSpeedComparator speedComparator = new CarSpeedComparator();
        Arrays.sort(cars, speedComparator);
        printCars(cars);

        System.out.println("Model Comparator: ");
        Arrays.sort(cars, new CarModelComparator());
        printCars(cars);

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        printCars(cars);

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getYear() - o1.getYear();
            }
        });
        printCars(cars);

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare != 0) {
                    return yearCompare;
                }

                return c2.getModel().compareTo(c1.getModel());
            }
        });
        printCars(cars);

        Arrays.sort(cars, (c1, c2) -> {
            return c2.getYear() - c1.getYear();
        });
        printCars(cars);

        Arrays.sort(cars, (c1, c2) -> c2.getYear() - c1.getYear());
        printCars(cars);

        Comparator<Car> carComparator = (c1, c2) -> {
            int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();

            if (speedCompare == 0) {
                return c1.getYear() - c2.getYear();
            }

            return speedCompare;
        };

        Arrays.sort(cars, carComparator);

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
