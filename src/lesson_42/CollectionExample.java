package lesson_42;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> strings;
        strings = new ArrayList<>();

        // int .size()
        System.out.println("strings.size(): " + strings.size());

        // boolean .isempty()
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean .add(T t)
        strings.add("Java");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        // .toString()
        System.out.println("strings.toString(): " + strings);

        // .of()
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("integers: " + integers);
        // integers.add(7); // Error

        // .addAll(Collection<? extends T> col)
        strings.addAll(List.of("JS", "Go Land", "Ruby"));
        System.out.println(strings);

        System.out.println("===================");

        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        // .removeAll(Collaction<? extends T> colB)
        colA.removeAll(List.of(3, 2, 1, 10));
        System.out.println(colA);

        // .retainAll(Collaction<? extends T> colB)
        colA.retainAll(List.of(4, 5));
        System.out.println(colA);

        // boolean .containsAll(Collection col)
        System.out.println(colA.containsAll(List.of(4, 5)));

        // boolean .remove(Object obj)
        System.out.println(colA.remove(4) + " : " + colA);

        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        // boolean .removeAll(Collaction<? extends T> colB)
        System.out.println(colA.removeAll(List.of(3, 0)) + " : " + colA);

        // boolean contains(Object obj)
        System.out.println(colA.contains(2));

        // .clear()
        colA.clear();
        System.out.println(colA);
    }
}
