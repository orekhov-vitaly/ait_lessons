package homeworks.homework_20;

/*-
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
*/

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        printArray(getSimpleNumbersArray(numbers));
    }

    public static int[] getSimpleNumbersArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isSimpleNumber = true;
            if (array[i] > 0) {
                for (int j = 2; j <= array[i] / 2 + 1; j++) {
                    if (array[i] % j == 0) {
                        isSimpleNumber = false;
                        break;
                    }
                }
            } else {
                isSimpleNumber = false;
            }
            if (isSimpleNumber) count++;
        }
        int[] newArray = new int[count];
        for (int k = 0; k < newArray.length; k++) {
            for (int i = 0; i < array.length; i++) {
                boolean isSimpleNumber = true;
                if (array[i] > 0) {
                    for (int j = 2; j <= array[i] / 2 + 1; j++) {
                        if (array[i] % j == 0) {
                            isSimpleNumber = false;
                            break;
                        }
                    }
                } else {
                    isSimpleNumber = false;
                }
                if (isSimpleNumber) {
                    newArray[k] = array[i];
                }
            }
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "}\n"));
        }
    }
}
