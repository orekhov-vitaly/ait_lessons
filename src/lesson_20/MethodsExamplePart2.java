package lesson_20;

public class MethodsExamplePart2 {
    public static void main(String[] args) {
        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        System.out.println("===========\n");

        int[] link = numbers;
        link[2] = -100;
        System.out.println("Numbers:");
        printArray(numbers);
        System.out.println("Link:");
        printArray(link);

        String str1 = "Hello";
        String str2 = str1;
        str2 = "world";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("===========\n");
        String hello = "Hello";
        changeMe(hello);
        System.out.println(hello);
        hello = null;
        System.out.println(hello);


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) System.out.print("[");
            System.out.print(array[i] + (i == array.length - 1 ? "]\n" : ", "));
        }
    }

    public static void changeMe(int x) {
        x = 100;
    }

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }

    public static void changeMe(String str) {
        str = str.toLowerCase();
    }
}
