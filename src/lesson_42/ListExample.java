package lesson_42;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>(50);
        list = new ArrayList<>(List.of(1, -10, 0, 25,-100));

        // LinkedList
        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1, -10, 0, 25,-100));

        // Methods List interfase
        // boolean .add(E e)
        list.add(1000);
        System.out.println("List: " + list);

        // void add(int index, E element)
        list.add(3, 500);
        System.out.println("List: " + list);

        // E .get(int index)
        int value = list.get(5);
        System.out.println("value: " + value);
        System.out.println("List: " + list);

        // E .remove(int index)
        System.out.println("list.remove(5): " + list.remove(5));
        System.out.println("List: " + list);

        // boolean .remove(Object obj)
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println("List: " + list);
    }
}
