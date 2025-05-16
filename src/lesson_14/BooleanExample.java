package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        // Логический тип данных
        boolean bool = true;
        bool = false;

        System.out.println(bool);

        // Условные выражения ->  операция сравнения или логическая операция

        // Операции сравнения: между двумя операндами (значениями) - результат всегда boolean

        int x = 10;
        int y = 7;

        // Срвнение на равенство ==
        boolean b1 = x == y;
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        // Сравнение на неравенство !=
        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // Больше >
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // Больше или равно >=
        b1 = x >= y;
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // Меньше <
        b1 = x < y;
        System.out.printf("%s < %s -> %s\n", x, y, b1);

        // Меньше илит равно <=
        b1 = x <= y;
        System.out.printf("%s <= %s -> %s\n", x, y, b1);

        // Методы класса String, возвращающие boolean

        // contains - проверяет, содержит ли строка указанную подстроку.
        // возвращает true, если подстрока найдена и false, если не найдена
        String str = "Java is the best!";
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\") = " + contains);
        System.out.println("str.contains(\"java\") = " + str.contains("java"));
        System.out.println(str.concat("is t"));

        // startsWith(), endsWith() - начинается / оканчивается строка на указанную подстроку
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.startsWith(\"Ja\") = " + startsWith);
        startsWith = str.startsWith("is t");
        System.out.println("str.startsWith(\"is t\") = " + startsWith);

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(\"best\") = " + endsWith);

        endsWith = str.endsWith("best!");
        System.out.println("str.endsWith(\"best!\") = " + endsWith);

        System.out.println("\n===== Логические операции =====\n");

        // Логическое НЕ (отрицание) - NOT ("!")
        // Меняет значение boolean на противоположное
        boolean b2 = false;
        b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения, которые объединяют два условия

        /*
        Логическое И "&"
        Исползуется когда надо, чтобы оба условия были true.
        Возвращает true, если оба условия имеют true.
        */

        b2 = true & true;
        System.out.println("true & true: " + b2);
        System.out.println("true & false: " + (true & false));
        System.out.println("false & true: " + (false & true));
        System.out.println("false & false: " + (false & false));

        // проверку, что число входитт в нужный диапазон
        // Введите число от 0 до 100
        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("Вы ввели нужное число: " + b2);

        System.out.println("\n===== Логическое ИЛИ \"|\" =====\n");
        // Логическое ИЛИ |
        // Возвращает true, если хотябы одно из условий истина
        b2 = true | true;
        System.out.println("true | true: " + b2);
        System.out.println("true | false: " + (true | false));
        System.out.println("false | true: " + (false | true));
        System.out.println("false | false: " + (false | false));

        System.out.println("\n===== Логическое исключающее ИЛИ (XOR) \"^\" =====\n");
        // Логическое исключающее ИЛИ (XOR) "^"
        // Возвращает true, если две части выражения разные
        b2 = true ^ true;
        System.out.println("true ^ true: " + b2);
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("false ^ false: " + (false ^ false));
    }
}
