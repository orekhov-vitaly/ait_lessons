package lesson_46;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        task9();
    }

    private static void task9() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.println("Map: " + map);
    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null, cat2, cat3, new Cat(null, 10, "red")};

        List<Cat> longCats = Arrays.stream(cats)
                // .filter(c -> c != null)
                // .filter(c -> Objects.nonNull(c))
                .filter(Objects::nonNull)

                .filter(c -> Objects.nonNull(c.getName()))

                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        System.out.println("longCats: " + longCats);

        Objects.nonNull(null);
        Objects.isNull(null);
    }

    private static void task7() {
        List<Cat> cats = getListCats();

        Stream<String> stream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("peek: " + cat))
                .map(Cat::getName);

        stream.forEach(cat -> System.out.println("forEach: " + cat));
    }

    private static void task6() {
        List<Cat> cats = getListCats();

        List<String> names = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("names: " + names);

        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println("names2: " + names2);
    }

    private static void task5() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<String> names = catStream.map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }

    private static void task4() {
        List<Cat> cats = getListCats();

        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> names = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> longNames = stream.collect(Collectors.toList());

        System.out.println(longNames);
    }

    private static void task2() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());

        System.out.println(fatCats);

        // Set<Cat> setCats = catStream.collect(Collectors.toSet()); // ERROR: stream has already been operated upon
        // or closed
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, -10, 24);
        List<Integer> result = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // =======================

        List<Integer> integerList = integers.stream()
                .filter(num -> num > 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("list: " + integerList);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

}
