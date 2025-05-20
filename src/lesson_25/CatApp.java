package lesson_25;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty", 8, 5);

        cat.sayMeow();
        cat.info();

        // cat.age = 1000; // Имеет модификатор private
        cat.weight = 1500;
        cat.name = null;

        cat.info();

        System.out.println(cat.getName());
        cat.setAge(50);
        cat.info();
        cat.setAge(10);
        cat.info();
    }
}
