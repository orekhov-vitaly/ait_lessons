package homeworks.homework_19;

/*
Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
*/

public class Task3 {
    public static void main(String[] args) {
        printPowerOfTow(4);
        printPowerOfTow(0);
        printPowerOfTow(-3);
    }

    public static void printPowerOfTow(int power) {
        float result = 2;
        if(power > 0) {
            for (int i = 1; i < power; i++) {
                result *= 2;
            }
            System.out.println((int) result);
        } else if (power < 0) {
            for (int i = 0; i >= power; i--) {
                result /= 2;
            }
            System.out.println(result);
        } else {
            result = 1;
            System.out.println((int) result);
        }
    }
}