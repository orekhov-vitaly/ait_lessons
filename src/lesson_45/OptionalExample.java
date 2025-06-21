package lesson_45;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // class Optional<T>
        Optional<String> name = Optional.of("Alice");
        System.out.println(name);

        // name = Optional.of(null);

        Optional<String> name2 = Optional.ofNullable(null);
        System.out.println(name2);
        name2 = Optional.ofNullable("Bob");
        System.out.println(name2);
        System.out.println();

        // Optional.empty()
        Optional<String> emptyName = Optional.empty();
        System.out.println(emptyName);

        System.out.println("======== Get value without Optional ========\n");

        // get() - get value without Optional
        String string = name.get();
        System.out.println("name.get(): " + string);

        // System.out.println(emptyName.get()); // error

        // isPrecent() - return true, if Optional has value

        if(emptyName.isPresent()) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("No name");
        }

        // orElse(T default)
        String result = name.orElse("Guest!");
        System.out.println("Hello, " + result);

        result = emptyName.orElse("Guest!");
        System.out.println("Hello, " + result);

        // ifPresent()
        name.ifPresent(n -> System.out.println("Hello, " + n));
        emptyName.ifPresent(n -> System.out.println("Hello, " + n));
    }
}
