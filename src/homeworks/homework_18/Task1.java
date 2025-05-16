package homeworks.homework_18;

/*Task 1
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве*/

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Создание массива
        int[] digits = new int[rand.nextInt(11) + 5];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = rand.nextInt(101) - 50;
        }
        // /Создание массива

        // Вычисления
        int min = digits[0];
        int max = digits[0];
        double average = 0;

        for (int i = 0, sum = 0; i < digits.length; i++) {
            if (min > digits[i]) min = digits[i];
            if (max < digits[i]) max = digits[i];
            sum += digits[i];
            if (i == digits.length - 1) average = (double) sum / digits.length;
        }
        // /Вычисления

        // Вывод
        for (int i = 0; i < digits.length; i++) {
            if (i == 0) System.out.print("Array digits: [");
            System.out.print(digits[i]);
            if (i != digits.length - 1) System.out.print(", ");
            else System.out.print("]\n");
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + average);
        // /Вывод
    }
}
