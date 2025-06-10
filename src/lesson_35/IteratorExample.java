package lesson_35;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.addAll("Hello", "World", "Java", "JS");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }

        System.out.println("=========");

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            System.out.println(current);
        }

        System.out.println("=========");

        // Цикл for each

        /*
        for (Тип переменная : коллекция) {
            // тело цикла
        }
        */

        for (String current : list) {
            System.out.println(current);
        }
    }
}
