package homeworks.homework_14;

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
   Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
   Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        boolean even = number % 2 == 0;
        boolean multiple3 = number % 3 == 0;
        System.out.printf("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b\n", number, even, multiple3, (even & multiple3));
    }
}