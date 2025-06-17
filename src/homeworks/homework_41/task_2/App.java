package homeworks.homework_41.task_2;

import lesson_41.Car;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        // Сортировка массива с использованием компаратора
        //[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur

        Arrays.sort(integers, new MyComparator());
        printIntegers(integers);

        Integer[] integers2 = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        Arrays.sort(integers, new MyComparator2());
        printIntegers(integers);
    }

    private static void printIntegers(Integer[] integers) {
        System.out.println("====================");
        for (Integer integer : integers) {
            System.out.print(integer);
        }
        System.out.println("\n====================");
    }
}
