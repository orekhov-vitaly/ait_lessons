package lesson_31.abstract_example;

/*
Если класс-потомок реализовал не все абстрактные методы родителя, то такой класс ДОЛЖЕН быть помечен как абстрактный
 */

public abstract class Dog extends Animal{
    @Override
    void move() {
        System.out.println("Dog is moving");
    }
}
