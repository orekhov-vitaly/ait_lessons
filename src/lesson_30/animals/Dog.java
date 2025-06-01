package lesson_30.animals;

public class Dog extends Animal {
    @Override
    public String toString() {
        return super.toString() + " | Dog";
    }

    public void bark() {
        System.out.println("Dog bark!");
    }
}
