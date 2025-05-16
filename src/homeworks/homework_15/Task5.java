package homeworks.homework_15;

/*Task 2
Попросите пользователя ввести две строки — они будут как бы «допустимыми значениями». Затем попросите ввести третью строку. Программа должна напечатать true, если третья строка равна хотя бы одной из первых двух, и false — если она не совпадает ни с одной.

Пример:

Введите первую строку: `кот`
Введите вторую строку: `собака`
Введите третью строку: `кот`
Результат: `true`*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();
        System.out.println("Результат: " + (str1.equals(str3) || str2.equals(str3)));
    }
}
