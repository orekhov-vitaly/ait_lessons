package homeworks.homework_43;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    public static <T> Set<T> union(Set< T> set1, Set<T> set2) {
        Set<T> newSet1 = new HashSet<>(set1);
        Set<T> newSet2 = new HashSet<>(set2);
        newSet1.removeAll(set2);
        newSet2.removeAll(set1);
        newSet1.addAll(newSet2);
        return newSet1;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
