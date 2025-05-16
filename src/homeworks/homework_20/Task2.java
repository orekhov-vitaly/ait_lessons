package homeworks.homework_20;

/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
*/

public class Task2 {
    public static void main(String[] args) {
        String[] strings = {
                "Hello",
                "world",
                "Java",
                "JavaScript"
        };

        printArray(getArrayLongShortString(strings));
    }

    public static String[] getArrayLongShortString(String[] array) {
        if(array == null || array.length == 0){
            return new String[0];
        }
        String[] longShortArray = {array[0], array[0]};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].length() > longShortArray[0].length()) {
                longShortArray[0] = array[i];
            }
            if (array[i] != null && array[i].length() < longShortArray[1].length()) {
                longShortArray[1] = array[i];
            }
        }
        return longShortArray;
    }

    public static void printArray(String[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "}\n"));
        }
    }
}
