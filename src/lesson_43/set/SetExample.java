package lesson_43.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        String str = "abc";
        int code = str.hashCode();
        System.out.println(code);

        String str2 = new String("abc");
        System.out.println(str2.hashCode());

        System.out.println(str.equals(str2));
        System.out.println(str.hashCode() == str2.hashCode());

        // Constructors

        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, -10, 5, 6, -25, 3, 6, -4, 0));

        System.out.println("set: " + set);

        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32);

        // HashSet
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers: " + integers);

        // LinkedHashSet
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSett: " + linkedSet);

        linkedSet = new LinkedHashSet<>();

        System.out.println("integers.add(100) #1: " + integers.add(100));
        System.out.println(integers);
        System.out.println("integers.add(100) #2: " + integers.add(100));

        System.out.println("===================");

        System.out.println("integers.remove(100): " + integers.remove(100));
        System.out.println(integers);

        // boolean contains(Object obj)
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size()
        boolean isEmpty()
        clear()
         */

        System.out.println("===================");
        // System.out.println(integers[2]); // Error

        // iterator()
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        for (Integer val : integers) {
            System.out.print(val + ", ");
        }
        System.out.println();

        // Remove duplicate
        System.out.println("startValues: " + startValues);

        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList: " + result);
        System.out.println("===================");

        /*
        SortedSet
         */
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet: " + sortedSet);

        sortedSet = new TreeSet<>(startValues);
        sortedSet.add(10);
        System.out.println("sortedSet: " + sortedSet);

        sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(startValues);
        sortedSet.add(10);
        System.out.println("sortedSet: " + sortedSet);

        homework("Тестовая строка  для удаления слов,  которые повторяются.");
    }

    private static void homework(String str) {
        String newStr = str.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        String[] words = newStr.split("\\s+");
        System.out.println(Arrays.toString(words));

        List<String> wordsList = Arrays.asList(words);
        System.out.println(wordsList);
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}