package lesson_25;

public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void info() {
        System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
    }

    void sayMeow() {
        System.out.println("Meow! " + name);
    }
}
