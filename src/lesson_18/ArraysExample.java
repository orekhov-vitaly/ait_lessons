package lesson_18;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array; // Объявление массива целых чисел
        int array1[]; // Альтернтивный способ. НЕ РЕКОМЕНДУЕТСЯ
        String[] strings; // Объявляем массив строк

        array = new int[4]; // создали массив типа int на 4 ячейки
        strings = new String[10];
        int[] array2 = new int[8];
        boolean[] bools = new boolean[3];

        int value = array2[4];
        System.out.println("array2[4]" + value);

        int[] numbers = new int[]{45,56,-16,0,159};
        int[] ints = {10,54,3233};
        int val = numbers[0];

        int len  = numbers.length;
        System.out.println(len);

        numbers[2] = 100;

        int i = 0;
        while (i < len) {
            System.out.print(numbers[i++]+ ", ");
        }

        System.out.println();

        int[] numbers1 = new int[10];
        int j = 0;
        Random random = new Random();
        System.out.print("[");
        while (j < numbers1.length) {
            numbers1[j] = random.nextInt(100);
            if (j == numbers1.length - 1) {
                System.out.print(numbers1[j]);
            } else {
                System.out.print(numbers1[j] + ", ");
            }
            j++;
        }
        System.out.print("]");
        System.out.println();

        int min = numbers1[0];
        i=0;
        while (i < numbers1.length) {
            if (numbers1[i] < min) min = numbers1[i];
            i++;
        }
        System.out.println("min: " + min);
    }
}
