package homeworks.homework_12;

/*
Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:

Значение myDouble: 10.0
*/

public class Task1 {
    public static void main(String[] args) {
        int intValue = 10;
        double myDouble = intValue;
        System.out.println("Значение myDouble: " + myDouble);
    }
}
