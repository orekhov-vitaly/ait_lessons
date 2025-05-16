package homeworks.homework_17;

/*Task 5 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое число произвольной длины: ");
        int number = scanner.nextInt();
        scanner.nextLine();
//        int number = 654321;
        String digits = "" + number;

        int count = 0;
        int sum = 0;
        while (count < String.valueOf(number).length()) {
            sum += Integer.parseInt(String.valueOf(digits.charAt(count)));
            count++;
        }
        System.out.println(sum);
    }
}
