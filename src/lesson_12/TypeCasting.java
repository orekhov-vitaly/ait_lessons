package lesson_12;

public class TypeCasting {
    public static void main(String[] args) {
    /*
    Преобразование типов данных - это изменение значения из одного типа данных в другой.
    В Java есть два способа преобразования типов данных:
    1. Не явное преобразование (автоматическое)
    2. Явное преобразование (кастинг)
    */

        // Неявное преобразование происходит автоматически, когда значение меньшего типа данных преобразуется в больший тип данных.
        byte byteVal = 123;
        int intVal;
        // = 123(byte) -> 123(int)
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);

        // double > int
        // 123(int) -> 123.0(double)
        double doubleVal = intVal; // Неявное преобразование int в double
        System.out.println("doubleVal: " + doubleVal);

        // Явное преобразование
        /*
        Требуется, когда нужно преобразовать из большего типа данных в значение меньшего типа данных.
        */

        double doubleVal2 = 42.9;
        int intV = (int) doubleVal2; // Явное преобразование из double в int
        System.out.println("intV: " + intV);

        // 42(int) -> short = (short) 42(short)
        short shortVal = (short) intV;
        System.out.println("shortVal: " + shortVal);

        System.out.println("==============\n");

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;
    }
}
