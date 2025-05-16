package homeworks.homework_19;

/*Task 1
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)*/

public class Task1 {
    public static void main(String[] args) {
        String str = "Hello world!";
        printNumberOfCharInString(str);

        printNumberOfCharInString("Как дела?");
    }

    public static void printNumberOfCharInString(String string) {
        System.out.println(string.length());
    }
}
