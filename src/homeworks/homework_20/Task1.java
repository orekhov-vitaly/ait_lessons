package homeworks.homework_20;

/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
*/

public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};

        printArray(copyArray(array, 4));
        printArray(copyArray(array, 12));
        printArray(copyArray(array, 0));
        printArray(copyArray(array, -5));
    }

    public static int[] copyArray(int[] arr, int length) {
        if(length < 0) {
            return new int[0];
        }
        int[] newArray = new int[length];

        for (int i = 0; i < arr.length && i < length; i++) {
            newArray[i] = arr[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        if(array != null && array.length > 0) {
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + (i != array.length - 1 ? ", " : "}\n"));
            }
        }
    }
}
