package homeworks.homework_44;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.
 */

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        String newText = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        String[] words = newText.split("\\s+");

        Map<String, Integer> result = new LinkedHashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, (result.get(word) + 1));
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (char ch : chars) {
            if (result.containsKey(ch)) {
                result.put(ch, (result.get(ch) + 1));
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }
}
