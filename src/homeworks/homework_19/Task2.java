package homeworks.homework_19;

/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]


Task 2.1. * Опционально
Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
*/

public class Task2 {
    public static void main(String[] args) {
        int[] digits = {1, 4, 3, 6, 7};
        printArrayReverse(digits);

        printArrayReverse(digits, 2);
        printArrayReverse(digits, 5);
        printArrayReverse(digits, 0);
    }

    public static void printArrayReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i != 0 ? ", " : "]\n"));
        }
    }

    public static void printArrayReverse(int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < array.length && i < index; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
        if(index < array.length - 1) {
            for (int i = array.length - 1; i >= index && i >= 0; i--) {
                System.out.print(array[i] + (i != index ? ", " : "]\n"));
            }
        }
    }
}
