package homeworks.homework_43;

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String testString) {
        String clearedString = testString.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        // System.out.println(clearedString);

        String[] words = clearedString.split("\\s+");
        // System.out.println(Arrays.toString(words));

        Set<String> set = new TreeSet<>(Arrays.asList(words));

        List<String> result = new ArrayList<>(set);

//        result.sort((w1, w2) -> w1.length() - w2.length());
        result.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return result;
    }
}
