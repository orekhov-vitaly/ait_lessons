package homeworks.homework_15;

/*Task 3
Создайте две переменные a и b, в каждую сохраните случайное число от 0 до 10 с помощью Random. Программа должна напечатать true, если результат деления a / b больше 2.

Дополнительно: если b == 0, программа не должна выполнять деление. В этом случае результат должен быть false.

Пример:

a = 9, b = 3 → результат: `true`

a = 5, b = 0 → результат: `false`*/

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(11);
        int b = random.nextInt(11);
        System.out.printf("a = %d, b = %d → результат: %b", a, b, (b != 0 && a / b > 2));
    }
}
