package lesson_13;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java"; // Объявление и инициализация переменной типа String
        System.out.println("string: " + string);

        String string1 = new String("Hello"); // Не рекоммендуемый способ
        System.out.println("string1: " + string1);

        // Методы для работы со строками

        // Получить кол-во символов в строке (длина строки)
        int length = string.length(); // в результате работы метода мы получаем число соответствующее количеству символов в этой строке
        System.out.println("Length string: " + length);

        // Метод позволяет перевести все символы в строке в верхний регистр
        System.out.println(string.toUpperCase());
        /*
        * String иммутабельны (неизмьеняемые)
        * toUpperCase() - возвращает новую строку, где все буквы в верхнем регистре
        * Если я хочу соханить полученный результат - я должен сохранить ее в переменную*/
        String stringUpper = string.toUpperCase();
        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        System.out.println(string.toLowerCase());
        stringUpper = stringUpper.toLowerCase();
        System.out.println(string);

        System.out.println("==========\n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты конкатенации строк

        // Конкатенация 1. С помощью оператора +
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // Конкатенация 2. Меод concat() - явный способ объединения двух строк
        concatStr = str1.concat(str2); // str1 + str2
        concatStr = concatStr.concat(str3); // str1 + str2 + str3
        concatStr.concat("" + 5); // Метод concat() работатет только со строками. Автокастирование не работает

        // Цепочка методов
        String concatNew = str1.concat(str2).concat(str3).concat("!"); // str1 + str2 + str3
        System.out.println("concatNew: " + concatNew);

        // Конкатенация 3.
        // "One", "hello", "java" -> "One hello java"
        // Позволяет объеденить строки с разделителем
        concatStr = String.join(" ", str1, str3, "java");
        System.out.println("concat 3: " + concatStr);
        System.out.println("==========\n");

        // Что происходит, когда + стоит между строкой и другм типом данных (например, числом)
        // Когда одна из частей выражения является строкой, Java выполняет неявное преобразование другой части выражения к строке.
        int id = 1;
        System.out.println("My id: " + id);
        System.out.println(1+3);
        System.out.println("2 + 3 = " + (2 + 3));
        System.out.println("==========\n");

        // Каждая строка состоит из символов, которые имеют свой индекс. Индексация начинается с 0
        String digits = "0123456789";
        String word = "Programming";
        System.out.println("digits: " + digits);
        System.out.println("digits.length(): " + digits.length());
        char firstChar = digits.charAt(0);
        System.out.println("firstChart: " + firstChar);

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);
        System.out.println("word.charAt(word.length() - 1): " + word.charAt(word.length() - 1));

        // Извлечение подстроки - это процесс полученя части 0строки на основе указанных индексов
        // Метод substring()
        // "status: online"
        String status = "status: online";

        String subString = status.substring(8);
        System.out.println("status.substring(8): " + subString);

        String subString2 = digits.substring(2, 7);
        System.out.println("digits.substring(2, 7): " + subString2);
        System.out.println("==========\n");

        // replace() - заменяет все найденные совпадения на заданное значение
        String str = "One World One";
        String result = str.replace("One", "World");
        System.out.println("result: " + result);

        // replaaceFirst() - заменяет только первое найденное совпадение
        result = str.replaceFirst("One", "World");
        System.out.println("result: " + result);

        // replaceAll() - заменяет все найденные совпадения
        result = str.replaceAll("One" , "World");
        System.out.println("result: " + result);

    }
}
