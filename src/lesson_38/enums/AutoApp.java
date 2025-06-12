package lesson_38.enums;

import org.w3c.dom.ls.LSOutput;

public class AutoApp {
    public static void main(String[] args) {
        // Auto auto = new Auto("X-308", "Hello world");

        // В переменную типа  мьожно присвоить только одну из констант
        Color color = Color.RED;

        Auto auto = new Auto("X-308", Color.BLACK);
        System.out.println(auto);
        auto.setColor(color);
        System.out.println(auto);

        // Возвращаем массив всех значений
        Color[] colors = Color.values();

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Возвращает enum по его строковому имени
//        System.out.println(Color.RED.equals("RED"));
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // Получить имя константы
        String name = Color.RED.name();
        System.out.println(name + "!");

        // Получить порядковый номер
        int ordinal = Color.YELLOW.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println(auto);
        if (auto.getColor() == Color.YELLOW) {
            System.out.println("Yellow");
        } else {
            System.out.println("Not yellow");
        }

        // Enum часто используются в switch
        switch (auto.getColor()) {
            case RED:
                System.out.println("Red");
                break;
            case BLACK:
                System.out.println("Black");
                break;
            case YELLOW:
                System.out.println("Yellow");
                break;
        }
    }
}
