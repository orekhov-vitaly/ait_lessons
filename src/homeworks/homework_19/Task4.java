package homeworks.homework_19;

/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
*/

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] digits = new int[50];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(100) + 1;
        }

        printSimpleDigitsOfArray(digits);
    }

    public static void printSimpleDigitsOfArray(int[] digits) {
        System.out.print("[");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + (i != digits.length - 1 ? ", " : "]\n"));
        }

        for (int i = 0; i < digits.length; i++) {
            boolean simpleDigit = true;
            for (int j = 2; j <= digits[i]/2+1; j++) {
                if(digits[i]%j == 0 || digits[i] == 2) {
                    simpleDigit = false;
                    break;
                }
            }
            if(simpleDigit) {
                System.out.print(digits[i] + ", ");
            }
        }
    }
}
