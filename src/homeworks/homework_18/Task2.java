package homeworks.homework_18;

/*Task 2
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }*/

public class Task2 {
    public static void main(String[] args) {
        int[] array = { 5, 6, -25, 0, 31, -15 };
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }

        System.out.print("array: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        System.out.println("min: " + min + "; index: " + indexMin);
        System.out.println("max: " + max + "; index: " + indexMax);

        array[indexMax] = min;
        array[indexMin] = max;

        System.out.print("array: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
