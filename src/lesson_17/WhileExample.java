package lesson_17;

public class WhileExample {
    public static void main(String[] args) {

        /*
        while (условие) {
            // Тело цикла
            // код, который будет повторяться
        }

        - условие - выражение, которое возвращает true или false
        - блок кода внутри {} - тело цикла, которое выполяется пока условие истинное

        Предикат - условие вычисляется перед каждой итерацией цикла
        */

        int i = 1, sum = 0;
        while (i <= 100) sum += i++;
        System.out.println(sum);
        System.out.println("==========\n");

        i = 1;
        while (i < 21) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
            i++;
        }
        System.out.println("==========\n");

        String str = "Hello";

        long start = System.currentTimeMillis();

        i = 0;
        int count = str.length();

        while (i < count) {
            System.out.println(str.charAt(i));
            i++;
        }

        long end = System.currentTimeMillis();

        System.out.println("Прошло " + (end - start));
    }
}
