package lesson_11;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable;
        myFirstVariable = 10;
        int mySecondVariable = 25;
        mySecondVariable = 50;

        System.out.println("myFirastVariable: " + myFirstVariable);
        System.out.println("mySecondVariable: " + mySecondVariable);

        byte byteVar = 125;
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        short shortVar;
        shortVar = 31000;

        long longVar = 2_100_000_000_000L; // L в конце числа, чтобы указать, что тип long
        System.out.println("longVar: " + longVar);

        double doubleVar = 10.5421; // использется в 99% случаев
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 123.56f; // F/f - чтобы указать, что число float
        System.out.println("floatVar" + floatVar);
    }
}
