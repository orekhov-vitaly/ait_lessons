package lesson_12;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;

//        Сложение "+"
        result = 15 + 6;
        System.out.println("Result: " + result);

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

//        Вычитание "-"
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

//        Умножение "*"
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

//        Целочисленное деление "/" (между двумя целыми числами)
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

//        взятие остатка от деления "%"
        result = var1 % var2;
        System.out.println("var 1 % var2 = " + result);

        System.out.println("5 / 10 = " + (5/10));
        System.out.println("5 % 10 = " + (5%10));

        System.out.println("========\n");

        double doubleVar1 = 20.0; // Все числа, записанные в коде с точкой, воспринимаются компелятором как число в формате double
        double doubleVar2 = 7.0d; // Явно указано, что число записано в формате double
//        Знак операции "/" между двумя дробными числами - это деление без отбрасываня дробной части
        double doubleResult = doubleVar1 / doubleVar2;
        System.out.println("doubleRes = " + doubleResult);

    }
}
