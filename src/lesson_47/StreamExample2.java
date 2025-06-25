package lesson_47;

import lesson_46.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
        // task10();
        // task11();
        // task12();
        // task13();
        // task14();
        // task15();
        task16();
    }

    private static void task16() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> integers = Arrays.stream(ints) // intStream
                .boxed()
                // .mapToObj(i -> i)
                //.mapToObj(i -> Integer.valueOf(i))
                .collect(Collectors.toList());

        System.out.println(integers);
        System.out.println(integers.size());

        int[] intArray = integers.stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(intArray));
    }

    private static void task15() {
        List<Integer> integers = List.of(5, 3, 14, -10, 2, -15, -5, 0, 33);

        Optional<Integer> first = integers.stream()
                .sorted()
                .findFirst();

        int min = first.get();
        System.out.println(min);

        Optional<Integer> any = integers.stream()
                .sorted()
                .findAny();

        min = any.get();
        System.out.println(min);
    }

    private static void task14() {
        List<Integer> integers = List.of(5, 3, 14, 2, -15, 0, 33);

        List<Integer> minNumbersList = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(minNumbersList);

        List<Integer> numbers = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }

    private static void task13() {
        List<Integer> integers = List.of(5, 3, 14, -10, 2, -15, -5, 0, 33);

        long count = integers.stream()
                .filter(n -> n % 2 == 0 && n != 0)
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }

    private static void task12() {
        List<Cat> cats = getListCats();

        Optional<String> langName = cats.stream()
                .filter(Objects::nonNull)
                .map(cat -> cat.getName())
                .filter(Objects::nonNull)
                // .max((name1, name2) -> name1.length() - name2.length());
                // .max((n1, n2) -> Integer.compare(n1.length(), n2.length()));
                .max(Comparator.comparing(String::length));

        System.out.println(langName.orElse(null));

        String longestName = cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparing(String::length))
                .orElse(null);
        // .orElse("");

        System.out.println(longestName);
    }

    private static void task11() {
        List<Integer> integers = List.of(5, 3, 14, -10, 2, -15, -5, 0, 33);
        // List<Integer> integers = List.of(5, 3, 14, 10, 2, 15, 5, 0, 33);

        Optional<Integer> optMax = integers.stream()
                .filter(i -> i < 0)
                .peek(System.out::println)
                .max(Comparator.naturalOrder());

        System.out.println(optMax.orElse(null));

    }

    private static void task10() {
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);

        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = new ArrayList<>();
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
