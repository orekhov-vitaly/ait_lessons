package homeworks.homework_27;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Длина окружности с радиусом 5 = " + MathUtil.circumference(5));
        System.out.println("Длина окружности с радиусом 0 = " + MathUtil.circumference(0));
        System.out.println("Длина окружности с радиусом -2 = " + MathUtil.circumference(-2));
        System.out.println("==========\n");

        System.out.println("Площадь круга с радиусом 5 = " + MathUtil.circleRadius(5));
        System.out.println("Площадь круга с радиусом 0 = " + MathUtil.circleRadius(0));
        System.out.println("Площадь круга с радиусом -5 = " + MathUtil.circleRadius(-5));
        System.out.println("==========\n");


        // Task 5
        Random rand = new Random();

        // Создание массива собак и вывод начальных параметров на экран
        Dog[] dogs = new Dog[5];
        for (int i = 0; i < 5; i++) {
            dogs[i] = new Dog("Dog " + (i + 1), (rand.nextInt(5) + 3) * 10);
        }

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].info();
            System.out.println("-----------");
        }

        // Создание массива барьеров и вывод на экран
        int[] barriers = new int[7];
        for (int i = 0; i < 7; i++) {
            barriers[i] = (rand.nextInt(10) + 7) * 10;
        }

        for (int i = 0; i < barriers.length; i++) {
            System.out.printf("Высота барьера%d: %d\n", (i + 1), barriers[i]);
        }
        System.out.println("-----------");

        // Испытание и тренеровка собак. вывод результатов
        for (int i = 0; i < dogs.length; i++) {
            int barrierNumber = 0;
            int trainCounter = 0;
            for (int j = 0; j < barriers.length; j++) {
                if(dogs[i].jumpBarrier(barriers[j]) == 1) {
                    barrierNumber++;
                    break;
                } else if(dogs[i].jumpBarrier(barriers[j]) == 0) {
                    barrierNumber++;
                    do{
                        dogs[i].train();
                        trainCounter++;
                    }while(dogs[i].jumpBarrier(barriers[j]) == 0);
                } else {
                    break;
                }
            }
            dogs[i].info();
            System.out.printf("- количество барьеров: %d\n", barrierNumber);
            System.out.printf("- количество тренеровок: %d\n", trainCounter);
            System.out.println("-----------");
        }
    }
}
