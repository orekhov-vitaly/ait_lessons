package homeworks.homework_46;

import lesson_46.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Person> persons = getListPersons();

        System.out.println(persons);

        System.out.println(filterPersons(persons));
    }

    private static List<Person> filterPersons(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getCity() == "Berlin")
                .collect(Collectors.toList());
    }

    private static List<Person> getListPersons() {
        return List.of(
                new Person("John", 27, "Berlin"),
                new Person("Max", 21, "Mannheim"),
                new Person("Hanna", 33, "Berlin"),
                new Person("Jack", 24, "München")
        );
    }
}
