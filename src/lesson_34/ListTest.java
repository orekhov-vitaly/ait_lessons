package lesson_34;

import lists.MyArrayList;

public class ListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);

        System.out.println(list);

        list.addAll(120, 256, 456, 852);
        System.out.println(list);

        Integer value = list.get(0);
        System.out.println(value);

        System.out.println("==============\n");

        MyArrayList<String> strings = new MyArrayList<>();

        strings.add("Hello");
        strings.addAll("Java", "World");
        System.out.println(strings);
    }
}
