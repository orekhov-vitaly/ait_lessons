package homeworks.homework_17;

/*
Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
*/

public class Task3_1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x < 101 && y < 8) {
            if (x % 5 == 0) {
                System.out.println(x);
                y++;
            }
            x++;
        }
    }
}
