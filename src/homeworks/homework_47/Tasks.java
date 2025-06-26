package homeworks.homework_47;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        /*
        Task 1
        Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
         */
        System.out.println("=== Task 1 ===");
        List<Integer> intList = new ArrayList<>(createRandomIntList(20, 0, 2000));
        System.out.println(intList);

        List<Integer> result = intList.stream()
                .filter(i -> i > 10)
                // .sorted((i1, i2) -> i1 % 10 - i2 % 10) // Variant 1
                // .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10)) // Variant 2
                // .sorted(Comparator.comparing(i -> i % 10)) // Variant 3
                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder())) //
                // Variant 4
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println("======\n");
    }

    private static void task2() {
        /*
        Task 2
        Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
         */
        System.out.println("=== Task 2 ===");
        List<String> strings = List.of("test", "Abba", "arrow", "Arrow", "Computer", "Java");

        Optional<String> opionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        System.out.println(opionalString);

        if (opionalString.isPresent()) {
            System.out.println("min length string: " + opionalString.get());
        } else {
            System.out.println("Strings in list not finded");
        }

        System.out.println(opionalString.orElse("Something wrong"));

        opionalString.ifPresent(string -> System.out.println("if present: " + string));
        opionalString.ifPresentOrElse(str -> System.out.println("ifPresentElse: " + str), () -> System.out.println(
                "ifPresentElse: strings not finded"));

        System.out.println("======\n");
    }

    private static void task3() {
        /*
        Task 3
        Имеется список целых чисел. Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2, и собрать результат в новый список
         */
        System.out.println("=== Task 3 ===");
        List<Integer> intList = new ArrayList<>(createRandomIntList(20, 0, 20));
        System.out.println(intList);

        List<Integer> result = intList.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println("======\n");
    }

    private static List<Integer> createRandomIntList(int q, int min, int max) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            numbers.add(random.nextInt(max - min) + min);
        }

        return numbers;
    }
}
