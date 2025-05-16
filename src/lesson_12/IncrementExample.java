package lesson_12;

import org.w3c.dom.ls.LSOutput;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;

        x += 5; // x = x + 5;
        System.out.println("x: " + x);

        x -= 3; // x = x - 3;
        System.out.println("x: " + x);

        // Инкремент, декримент
        x++; // Инкремент - увеличение текущего значения в переменной на единицу
        System.out.println("x: " + x);

        x--; // Декримент - уменьшение текущего значения в переменной на единицу
        System.out.println("x: " + x);

        // Инкремент и декримент перед переменной ++x,--x
        int a = 100;

        System.out.println("a: " + a++);
        System.out.println("a: " + a);

        int b = 100;
        System.out.println("b: " + ++b);

        int result = b++;
        System.out.println("result: " + result);
        System.out.println("b: " + b);
    }
}
