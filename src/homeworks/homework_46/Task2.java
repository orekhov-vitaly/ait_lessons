package homeworks.homework_46;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("test", "Abba", "arrow", "Arrow", "Java", "A");

        System.out.println(filterStringsList(strings));
    }

    public static List<String> filterStringsList(List<String> strings) {
        return strings.stream()
                // .filter(s -> s.charAt(0) == 'A')
                // .filter(s -> s.substring(0, 1).equals("A"))
                // .filter(s -> s.substring(0, 1).equalsIgnoreCase("A"))
                // .filter(s -> s.toUpperCase().startsWith("A"))
                // .filter(s -> s.endsWith("a"))
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }
}
