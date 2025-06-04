package lesson_33;

import lesson_23.Cat;

public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>("Hello");

        System.out.println(box);

        box.getValue();

        String value = box.getValue();
        System.out.println(value.toUpperCase());

        box.setValue("New value!");
        System.out.println(box);
        System.out.println("========\n");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());

        // Нельзя поместить другой тип данных. Ошибка компеляции.
        // catBox.setValue("String");

        // // Дженерики не работают с примитивными типами данных
        // GenericBox<int> box2 = new GenericBox<>(10);
        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);

        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();

        System.out.println("sum: " + sum);
    }
}
