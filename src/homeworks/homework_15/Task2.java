package homeworks.homework_15;

/*Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4);

        int result = num1;
        if (num2 > result) result = num2;
        if (num3 > result) result = num3;
        if (num4 > result) result = num4;

        System.out.println("Максимальное число: " + result);
    }
}
