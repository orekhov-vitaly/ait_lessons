package homeworks.homework_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(200));
        }

        System.out.println(numbers);

        System.out.println(filterNumbers(numbers));
    }

    private static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 10)
                .filter(num -> num < 100)
                .collect(Collectors.toList());
    }
}
