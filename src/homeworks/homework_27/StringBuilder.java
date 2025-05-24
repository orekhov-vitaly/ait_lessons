package homeworks.homework_27;

import lesson_27.StringBuilderExample;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args) {
        pharseString();
    }

    public static String pharseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов: ");

        // trim() - убирает пробелы в начале и в конце строки

        String input = scanner.nextLine().trim();
        if(input.isEmpty()) return "";

        String[] words = input.split("\\s+");
        System.out.println("words: " + Arrays.toString(words));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.isEmpty()) continue;
            //sb.append(word.charAt(0));
        }

        return sb.toString().toUpperCase();
    }
}
