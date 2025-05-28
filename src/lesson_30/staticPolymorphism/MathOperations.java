package lesson_30.staticPolymorphism;

/*
* В JAVA полиморфизм проявляется в двух формах:
*
* - Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов (Method Overloading)
* */

public class MathOperations {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
}
