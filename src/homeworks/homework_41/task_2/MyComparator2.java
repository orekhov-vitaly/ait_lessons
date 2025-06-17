package homeworks.homework_41.task_2;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) {
            return -1;
        }
        if (a % 2 != 0 && b % 2 == 0) {
            return 1;
        }
        if (a % 2 != 0 && b % 2 != 0) {
            return Integer.compare(b, a);
        }
        return Integer.compare(a, b);
    }
}
