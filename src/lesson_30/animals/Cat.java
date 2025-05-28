package lesson_30.animals;

public class Cat extends Animal{
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!");
    }
}
