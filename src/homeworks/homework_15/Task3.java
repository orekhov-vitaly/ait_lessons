package homeworks.homework_15;

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число: ");
        String str = scanner.nextLine();

        if(str.length() == 4) {
            int num1 = str.charAt(0);
            int num2 = str.charAt(1);
            int num3 = str.charAt(2);
            int num4 = str.charAt(3);
            int sum1 = num1 + num2;
            int sum2 = num3 + num4;
            System.out.println(str + ", " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
            if (sum1 == sum2) {
                System.out.printf("Число %s -> (%d+%d) = %d; (%d+%d) = %d; %d равно %d - число счастливое.", str, num1, num2, sum1, num3, num4, sum2,sum1, sum2);
            } else {
                System.out.println("Не счастливый");
            }
        } else {
            System.out.println("что-то пошло не так (");
        }
    }
}
