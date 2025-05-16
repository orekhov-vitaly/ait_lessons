package homeworks.homework_17;

/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
*/

public class Task1 {
    public static void main(String[] args) {
        int x = 1;
        long result = x;

        while (x < 16) {
            result *= x;
            x++;
        }

        System.out.println("Произведение всех чисел от 1 до 15 включительно: " + result);
    }
}
