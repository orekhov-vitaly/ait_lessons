package homeworks.homework_18;

/*Task 3 * (Опционально)
Дан массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y*/

public class Task3 {
    public static void main(String[] args) {
        String[] words = { "One", "Two", "Twenty" };
        int indexLongestWord = 0;

        for (int i = 0; i < words.length; i++) {
            if (indexLongestWord < words[i].length()) indexLongestWord = i;
        }

        for (int i = 0; i < words[indexLongestWord].length(); i++) {
            System.out.println(words[indexLongestWord].charAt(i));
        }
    }
}
