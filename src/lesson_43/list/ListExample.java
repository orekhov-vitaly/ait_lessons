package lesson_43.list;

import java.util.ArrayList;
import java.util.Comparator;
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

        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)
        System.out.println("list.indexOf(4000): " + list.indexOf(4000));
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));
        System.out.println("================== sort ==================\n");

        list.sort((i1, i2) -> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());

        System.out.println("list: " + list);

        list.sort((i1, i2) -> Integer.compare(i1, i2));
        list.sort((i1, i2) -> i1.compareTo(i2));
        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());

        System.out.println("list: " + list);

        // List<E> subList(int idxFrom, int idxTo)



    }

    public static List<Integer> sortByComparator(List<Integer> list, Comparator<Integer> comparator) {
        List<Integer> result = new ArrayList<>();
        return null;
    }
}
