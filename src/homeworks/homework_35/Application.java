package homeworks.homework_35;

import lists.MyArrayList;
import lists.MyList;

public class Application {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello

        System.out.println("=================\n");

        MyList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        PrintTowLists.printTwoLists(names, scores);
        System.out.println("=================\n");

        NumericPair<Integer, Double> intPair = new NumericPair<>(10, (double) 20);
        System.out.println(intPair.sum()); // Вывод: 30.0

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0
    }
}
