package homeworks.homework_17;

/*
Task 3
Используйте цикл while для решения задачи:

Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
*/

public class Task3 {
    public static void main(String[] args) {
        int x = 1;

        while (x < 101) {
            if (x % 5 == 0) System.out.println(x);
            x++;
        }
    }
}
