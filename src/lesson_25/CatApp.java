package lesson_25;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty", 8, 5);

        cat.sayMeow();
        cat.info();

        cat.age = 1000;
        cat.weight = 1500;
        cat.name = null;

        cat.info();
    }
}
