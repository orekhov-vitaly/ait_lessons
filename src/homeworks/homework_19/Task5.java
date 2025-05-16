package homeworks.homework_19;

/*
Task5 * (опционально)
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:

1
12
123
1234
12345
123456
*/

public class Task5 {
    public static void main(String[] args) {
        printTriangleOfDigits(8);
    }

    public static void printTriangleOfDigits(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + (j == i ? "\n" : ""));
            }
        }
    }
}
