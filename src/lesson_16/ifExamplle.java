package lesson_16;

import java.util.Random;
import java.util.Scanner;

public class ifExamplle {
    public static void main(String[] args) {
        // Условный оператор if позволяет выборочно выполнять отдельные части программы (блоки кода)
        // Часто называют оператором принятия решений или оператором ветвления

        /*
        * if (условие) оператор;
        * условие - что-то, возвращающее типа boolean
        * */

        Random random = new Random();

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите ваш возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();
//        age = random.nextInt(50);

        System.out.println("===== Variant 1 =====");
        if (age >= 18) System.out.println("Вы совершеннолетний\n");
        else System.out.println("Вам меньше 18\n");

        System.out.println("===== Variant 2 =====");
        if (age >= 18) {
            System.out.println("Оператор блок");
            System.out.println("Вы совершеннолетний\n");
        } else {
            System.out.println("Блок else");
            System.out.println("Вам меньше 18\n");
        }

        System.out.println("Продолжение работы программы");

        int score = random.nextInt(101);
        System.out.println("Score: " + score);
        if (score >= 90) {
            System.out.println("Отлично!");
        } else if (score >=80) {
            System.out.println("Хорошо.");
        } else if (score >=70) {
            System.out.println("Удовлетворительно.");
        } else if (score >=60) {
            System.out.println("Плохо(");
        } else {
            System.out.println("Умственно одаренный.");
        }

        System.out.println("================\n");

        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);

        System.out.println(String.format("%d | %d | %d", v1, v2, v3));

        int min = v1;
        if (v2 < min) min = v2;
        if (v3 < min) min = v3;

        System.out.println("min: " + min);

        System.out.println("================\n");

        String result = (score >= 90) ? "Отлично!" : (score >= 80) ? "Хорошо." : (score >= 70) ? "Удовлетворительно." : (score >= 60) ? "Плохо(" : "Умственно одаренный.";

        System.out.println(result);
    }
}
