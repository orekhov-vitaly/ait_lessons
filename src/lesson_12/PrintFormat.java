package lesson_12;

public class PrintFormat {
    public static void main(String[] args) {
        double result = 20.0 / 7.0;
        int age = 25;
        String name = "Alice"; // Тип данных для хранения текста. Текст записывается ТОЛЬКО в кавычках.

        System.out.println("Name: " + name + ", Age: " + age + ", Score: " + result);

        // Форматированный вывод - printf
        // %d - целое число (digit)
        // %f - число с плавающей точкой (float)
        // %.3f - формат вывода числа - количество знаков после запятой
        // %s - строка/текст (string)
        System.out.printf("Name: %s, Age: %d, Score: %.3f\n", name, age, result);
        System.out.println("Hello");

    }
}
