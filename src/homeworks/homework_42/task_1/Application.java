package homeworks.homework_42.task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> integers1 = new ArrayList<>(List.of(7, 8, 5, 45, 77, 1, 23, 34, 54, 90, 3, 5, 7, 8, 12, 9, 0));
        List<Integer> integers2 = new ArrayList<>(List.of(7, 5, 77, 1, 23, 34, 8, 12, 9, 0, 100, 200, 300));

        List<Integer> integers3 = commonInts(integers1, integers2);
        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println(integers3);
    }

    public static List<Integer> commonInts(List intList1, List intList2) {
        List<Integer> result = new ArrayList<>(intList1);
        result.retainAll(intList2);
        return result;
    }
}
