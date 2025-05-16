package lesson_16;

public class TernaryOperator {
    public static void main(String[] args) {
        int  age = 20;

        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Ребенок";
        }

        status = (age >= 18) ? "Совершеннолетний" : "Ребенок";

        System.out.println(status);

        System.out.println("\n==========\n");

        int x = 20;
        System.out.println("Значение в переменной x " + "положительное / отрицательное");

        String res;

        if (x >= 0) {
            res = "положительное";
        } else {
            res = "отрицательное";
        }

        System.out.println("Значение в переменной x " + res);
        System.out.println("Значение в переменной x " + (x >=0 ? "положительное" : "отрицательное"));
    }
}
