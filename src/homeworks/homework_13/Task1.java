package homeworks.homework_13;

import java.util.Scanner;

/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        int length = name.length();
        char charFirst = name.charAt(0);
        char charLast = name.charAt(length - 1);
        System.out.println("Привет, " + name + "!");
        System.out.println("Количество символов в Вашем имене: " + length);
        System.out.println("Первый символ Вашего имени: " + charFirst);
        System.out.println("Последний символ Вашего имени: " + charLast);
    }
}
