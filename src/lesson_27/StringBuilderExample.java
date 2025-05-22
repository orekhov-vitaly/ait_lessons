package lesson_27;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        // String - неизменяемая последовательность символов
        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, объекты которого используются для создания и манипулирования с изменяемыми
        // строками
        // StringBuilder - изменяемьая последовательность символов

        // Перегруженные конструкторы. Может быть пустым, может принимать String
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("Hello");

        // Метод добавления символов в конец строки
        sb.append(" !"); // "Hello" + " !"

        // Получить строковое представление
        String string = sb.toString();
        System.out.println(string);

        sb = new StringBuilder("Java");
        sb.append(" ").append("is").append(" ").append("the").append(" ").append("best");
        System.out.println(sb.toString());

        // Вставить символы в указанную позицию
        System.out.println("=============\n");
        sb = new StringBuilder("Hello World");
        sb.insert(6, "beautifull ");
        System.out.println(sb.toString());

        String start = "Hello world";
        String result = start.substring(0, 6);
        result += "beautifull ";
        result += start.substring(6);
        System.out.println(result);

        System.out.println("=================\n");
        sb = new StringBuilder("Hello World!");
        sb.replace(6, 11, "Java");
        System.out.println(sb.toString());


        System.out.println("=================\n");
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println("index: " + index);

        index = sb.lastIndexOf("l");
        System.out.println("last index: " + index);

        System.out.println(sb.lastIndexOf("Java"));

        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(4);
        System.out.println("ch: " + ch);

        // Количество символов в sb
        sb = new StringBuilder("Hello");
        System.out.println("Length: " + sb.length());

        // Можно установить новую длину
        sb.setLength(10);
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8): " + (int) ch1);
        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println("sb.length(): " + sb.length());

        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов и возвращаюий
        аббревиатуру этой фразы
        научно исследовательский институт -> ИИ
        */

        String example = String.join(" ", "Java", "is", "the", "best");

        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));

        String symbols = "Qwedwq qwfwqf";
        char[] chars = symbols.toCharArray();
        System.out.println(Arrays.toString(chars));
    }

    public static String pharseString() {
        Scanner scanner = new Scanner(System.in);

        return null;
    }
}
