package homeworks.homework_36.task_2;

import lists.MyArrayList;
import lists.MyList;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3.14, 5.5);
        Rectangle rectangle3 = new Rectangle(123456, 654321);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
        System.out.println("==============\n");

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true
        System.out.println(rect1.equals(rect3)); // Должно быть false
        System.out.println("==============\n");

        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
    }

    public static <T extends Rectangle> void removeDuplicates(MyList<T> list, T object) {
//        for (int i = 0; i < list; i++) {
//            if (list[i].equals(object)) {
//                for (int j = i; i < list - 1; i++) {
//                    list[i] = list[i + 1];
//                }
//            }
//        }
    }
}
