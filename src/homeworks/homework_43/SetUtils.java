package homeworks.homework_43;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> newSet1 = new HashSet<>(set1);
        Set<String> newSet2 = new HashSet<>(set2);
        newSet1.removeAll(set2);
        newSet2.removeAll(set1);
        newSet1.addAll(newSet2);
        return newSet1;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
