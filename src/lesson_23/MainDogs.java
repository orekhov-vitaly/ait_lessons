package lesson_23;

public class MainDogs {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", 5);

        dog.info();

        dog.run();
        dog.run();
        dog.run();

        dog.info();
    }
}
