package homeworks.homework_43;

import java.util.*;

public class StrUtil {
    public static Character getFirstUniqueChar(String string) {
        SortedSet<Character> uniqueChars = new TreeSet<>();
        Set<Character> repetitiveChars = new LinkedHashSet<>();

        char[] chars = string.toCharArray();

        for (char ch : chars) {
            if (!repetitiveChars.contains(ch)) {
                if (uniqueChars.contains(ch)) {
                    uniqueChars.remove(ch);
                    repetitiveChars.add(ch);
                } else {
                    uniqueChars.add(ch);
                }
            }
        }

        return uniqueChars.first();
    }
}
