package lesson_14;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Обращаемся к стандартному потоку вывода
        System.out.println("Печатаем данные в консоль");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        // Чтение строки из консоли
        String name = scanner.nextLine();

        // Прочитать целое число
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Чтение числа с запятой
        System.out.println("Введите Ваш рост в метрах: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Привет, " + name + "!");
        System.out.println("age: " + age);
        System.out.println("Через год тебе будет " + (age + 1));
        System.out.println("Ваша высота: " + height + "м");
    }
}
