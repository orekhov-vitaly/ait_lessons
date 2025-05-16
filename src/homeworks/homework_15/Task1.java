package homeworks.homework_15;

/*Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1, 2 или 3: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String result;
        if (num == 1) {
            result = "Один";
        } else if (num == 2) {
            result = "Два";
        } else if (num == 3) {
            result = "Три";
        } else {
            result = "Что-то пошло не так ((";
        }

        System.out.println(result);
    }
}
