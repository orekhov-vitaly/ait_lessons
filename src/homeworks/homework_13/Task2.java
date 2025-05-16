package homeworks.homework_13;

/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

Task 2.2
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
*/

public class Task2 {
    public static void main(String[] args) {
        String wort1 = "Java";
        String wort2 = "is";
        String wort3 = "a";
        String wort4 = "powerful";
        String wort5 = "language";

        System.out.println("Task 2\n");

        String result1 = wort1 + " " + wort2 + " " + wort3 + " " + wort4 + " " + wort5;
        int length1 = result1.length();
        System.out.println("\"" + result1 + "\"");
        System.out.println("Количество символов: " + length1);

        String result2 = wort1.concat(" " + wort2).concat(" " + wort3).concat(" " + wort4).concat(" " + wort5);
        int length2 = result2.length();
        System.out.println("\"" + result2 + "\"");
        System.out.println("Количество символов: " + length2);
        System.out.println("==========\n");

        System.out.println("Task 2.2\n");
        String result3 = result1.replace("powerful", "super");
        System.out.println("\"" + result3 + "\"");

        String result4 = result2.replace("powerful", "super");
        System.out.println("\"" + result4 + "\"");
        System.out.println("==========\n");

    }
}
