package lesson_30.animals;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.voice(); // унаследован от Animal
        cat1.eat(); // метод класса Cat

        System.out.println("==========\n");

        Dog dog1 = new Dog();
        dog1.voice(); // унаследован от Animal

        Hamster hamster1 = new Hamster();

        // Класс Object является родителем ВСЕХ классов в Java, если явно не указан другой класс-родитель

        Object object = new Object();

        System.out.println("cat: " + cat1);

        System.out.println("dog: " + dog1);
    }
}
