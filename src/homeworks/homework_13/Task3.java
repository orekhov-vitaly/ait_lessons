package homeworks.homework_13;

import java.util.Scanner;

/*Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четное количество символов: ");
        String text = scanner.nextLine();
        int length = text.length();
        if (length % 2 != 0) {
            System.out.println("Вы ввели нечетное количество символов");
        } else {
            char char1 = text.charAt(length / 2 - 1);
            char char2 = text.charAt(length / 2);
            String result = String.valueOf(char1) + String.valueOf(char2);
            System.out.println(result);
        }
    }
}
