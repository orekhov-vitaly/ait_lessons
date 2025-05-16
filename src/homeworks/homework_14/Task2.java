package homeworks.homework_14;

/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран (в виде значения типа boolean).
*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        // Генератор псевдослучайных чисел
        Random random = new Random();

        int x = random.nextInt(51);;
        int y = random.nextInt(51) - 20;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("y < x: " + (y < x));
    }
}
