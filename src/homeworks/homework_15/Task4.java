package homeworks.homework_15;

/*Task1
Попросите пользователя ввести строку (предположительно "пароль") дважды. Сравните введенные строки и напечатайте true, если строки совпадают, и false в противном случае.

Пример:

Введите пароль: `java123`
Повторите пароль: `java123`
Результат: `true`*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите пароль: ");
        String str1 = scanner.nextLine();
        System.out.println("Ведите пароль еще раз: ");
        String str2 = scanner.nextLine();
        System.out.println("Результат: " + str1.equals(str2));
    }
}
