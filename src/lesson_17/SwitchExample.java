package lesson_17;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 7;

        if (x == 5) {
            System.out.println("Block if. x = 5");
        } else if (x == 7 ) {
            System.out.println("Block else-if. x = 7");
        } else {
            System.out.println("Block else.");
        }

        /*
        switch (выражение) {
            case значение1 :
                // Блок кода для значения1
            case значение2 :
                // Блок кода для значения2
            default :
                // Блок кода по умолчанию
        }

        выражение - переменная или выражение, которое будет сравниватьсяс нашим нбором значений
        case значение1 : - метка значения, с которой сравнивается выражение
        default : - блок кода по умолчанию, если ни один из case не совпал
        */

        System.out.println("\n==========\n");

        x = 11;

        switch (x) {
            case 5:
                System.out.println("Switch. x = 5");
            case 7:
                System.out.println("Switch. x = 7");
            default:
                System.out.println("Switch. Что-то другое");
        }

        System.out.println("\n==========\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4:
                System.out.println("Вы ввели три или четыре");
                break;
            default:
                System.out.println("Я не знаю что ты ввел");
        }
/*
        System.out.println("========\n");

        switch (number) {
            case 1 -> System.out.println("Вы ввели один");
            case 2 -> System.out.println("Вы ввели два");
            case 3, 4 -> System.out.println("Вы ввели три или четыре");
            default -> System.out.println("Я не знаю что ты ввел");
        }

        System.out.println("=========\n");

        String result = switch (number) {
            case 1 -> "Вы ввели один";
            case 2 -> "Вы ввели два";
            case 3, 4 -> "Вы ввели три или четыре";
            default -> "Я не знаю что ты ввел";
        };

        System.out.println("result = " + result);
*/

    }
}
