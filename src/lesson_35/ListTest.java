package lesson_35;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;

public class ListTest {
    public static void main(String[] args) {
        MyList<Integer> integers = new MyArrayList<>();
        System.out.println(integers);
        integers.add(100);
        integers.addAll(2,3,4,5,6,0,8,9,4,5,6);
        System.out.println(integers);
        System.out.println("siez: " + integers.size());
        int index = integers.indexOf(9);
        System.out.println("integers.indexOf(9): " + index);
        index = integers.indexOf(1000);
        System.out.println("integers.indexOf(1000): " + index);
        System.out.println("contains: " + integers.contains(50));
        index = integers.lastIndexOf(null);
        System.out.println("integers.lastIndexOf(null): " + index);
        integers.add(null);
        System.out.println(integers);
        index = integers.lastIndexOf(null); // NPE
        System.out.println("integers.lastIndexOf(null): " + index);
        System.out.println("==================\n");

        System.out.println("get(9): " + integers.get(9));
        System.out.println("get(10): " + integers.get(10));

        System.out.println(integers);
        System.out.println("remove(0): " + integers.remove(Integer.valueOf(0)));
        System.out.println(integers);

        System.out.println("remove(0): " + integers.remove(0));
        System.out.println(integers);
        System.out.println("==================\n");

        Integer[] array = integers.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));
    }
}
