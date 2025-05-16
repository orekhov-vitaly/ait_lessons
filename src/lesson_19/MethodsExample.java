package lesson_19;

public class MethodsExample {
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();

        char ch = 'a';
        System.out.println(ch);

        printDecimalCodOfChar(ch);
        printDecimalCodOfChar('a');

        char anotherChar = 'B';
        printDecimalCodOfChar(anotherChar);
        printDecimalCodOfChar('6');

        int[] array = {1,45,78,69,156,-156};
        printArray(array);

        array[0] = -12345;
        array[3] = 987;

        printArray(array);

        String[] strings = {"Hello", "world", "!", "Java"};

        printArray(strings);

        testParameterOrder(1, "Hello");
        testParameterOrder("Java", 5);

    } // end main
    // Methods area

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if(i == 0) System.out.print("[");
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i == 0) System.out.print("[");
            System.out.print(array[i] + (i == array.length - 1 ? "]\n" : ", "));
        }
    }

    // Написать метод приветствия пользователя
    public static void sayHello() {
        // Тело метода - код, который будет выполнен при вызове метода
        System.out.println("Hello, user!");
    }

    // Написать метод, который печатает в консоли код символа (char)
    public static void printDecimalCodOfChar(char ch1) {
        System.out.println((int) ch1);
    }

    public static void testParameterOrder(int x, String str) {
        System.out.println("Реализация №1 тест метода!");
    }

    public static void testParameterOrder(String str, int x) {
        System.out.println("Реализация №2 тест метода!");
    }

} // end class
