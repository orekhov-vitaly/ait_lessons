package homeworks.homework_27;

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


    }
}
