package lesson_31.abstract_example;

public class Application {
    public static void main(String[] args) {
        // Нельзя создать объект абстрактного класса
//        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.move();
        cat.sayHello();


    }
}
