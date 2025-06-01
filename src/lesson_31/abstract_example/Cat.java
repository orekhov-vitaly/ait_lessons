package lesson_31.abstract_example;

public class Cat extends Animal{

    // Если у родителя есть бстрактные методы, то в потомке их ОБЯЗАТЕЛЬНО надо реализовать!

    @Override
    void move() {
        System.out.println("Cat moving");
    }

    @Override
    void eat() {
        System.out.println("Cat eating");
    }
}
